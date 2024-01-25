import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class274 {

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "[I")
	public static final int[] anIntArray515 = new int[120];

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "Lclient!nf;")
	private Class238 aClass238_5 = null;

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
	private int anInt7633 = 65000;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "Lclient!nf;")
	private Class238 aClass238_6 = null;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
	private final int anInt7632;

	static {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < 120; local15++) {
			@Pc(20) int local20 = local15 + 1;
			@Pc(33) int local33 = (int) ((double) local20 + Math.pow(2.0D, (double) local20 / 7.0D) * 300.0D);
			local13 += local33;
			anIntArray515[local15] = local13 / 4;
		}
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(ILclient!nf;Lclient!nf;I)V")
	public Class274(@OriginalArg(0) int arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) int arg3) {
		this.aClass238_5 = arg1;
		this.aClass238_6 = arg2;
		this.anInt7632 = arg0;
		this.anInt7633 = arg3;
	}

	@OriginalMember(owner = "client!pn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt7632;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([BIII)Z")
	public boolean method6613(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class238 local12 = this.aClass238_5;
		synchronized (this.aClass238_5) {
			if (arg2 < 0 || this.anInt7633 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method6614(arg0, arg1, arg2, true);
			if (!local39) {
				local39 = this.method6614(arg0, arg1, arg2, false);
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([BIIZI)Z")
	private boolean method6614(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class238 local8 = this.aClass238_5;
		synchronized (this.aClass238_5) {
			try {
				@Pc(68) int local68;
				if (arg3) {
					if (this.aClass238_6.method5532() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass238_6.method5542((long) (arg1 * 6));
					this.aClass238_6.method5543(0, 6, Static670.aByteArray107);
					local68 = ((Static670.aByteArray107[4] & 0xFF) << 8) + (((Static670.aByteArray107[3] & 0xFF) << 16) + (Static670.aByteArray107[5] & 0xFF));
					if (local68 <= 0 || (long) local68 > this.aClass238_5.method5532() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aClass238_5.method5532() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				Static670.aByteArray107[3] = (byte) (local68 >> 16);
				Static670.aByteArray107[4] = (byte) (local68 >> 8);
				Static670.aByteArray107[1] = (byte) (arg2 >> 8);
				Static670.aByteArray107[5] = (byte) local68;
				Static670.aByteArray107[0] = (byte) (arg2 >> 16);
				Static670.aByteArray107[2] = (byte) arg2;
				this.aClass238_6.method5542((long) (arg1 * 6));
				this.aClass238_6.method5535(0, Static670.aByteArray107, 6);
				@Pc(165) int local165 = 0;
				@Pc(175) int local175 = 0;
				while (local165 < arg2) {
					@Pc(179) int local179 = 0;
					@Pc(214) int local214;
					if (arg3) {
						this.aClass238_5.method5542((long) (local68 * 520));
						try {
							this.aClass238_5.method5543(0, 8, Static670.aByteArray107);
						} catch (@Pc(198) EOFException local198) {
							return true;
						}
						local214 = (Static670.aByteArray107[1] & 0xFF) + ((Static670.aByteArray107[0] & 0xFF) << 8);
						local179 = ((Static670.aByteArray107[5] & 0xFF) << 8) + (((Static670.aByteArray107[4] & 0xFF) << 16) + (Static670.aByteArray107[6] & 0xFF));
						@Pc(252) int local252 = ((Static670.aByteArray107[2] & 0xFF) << 8) + (Static670.aByteArray107[3] & 0xFF);
						@Pc(258) int local258 = Static670.aByteArray107[7] & 0xFF;
						if (local214 != arg1 || local175 != local252 || this.anInt7632 != local258) {
							return false;
						}
						if (local179 < 0 || this.aClass238_5.method5532() / 520L < (long) local179) {
							return false;
						}
					}
					if (local179 == 0) {
						local179 = (int) ((this.aClass238_5.method5532() + 519L) / 520L);
						arg3 = false;
						if (local179 == 0) {
							local179++;
						}
						if (local68 == local179) {
							local179++;
						}
					}
					Static670.aByteArray107[0] = (byte) (arg1 >> 8);
					Static670.aByteArray107[2] = (byte) (local175 >> 8);
					Static670.aByteArray107[1] = (byte) arg1;
					Static670.aByteArray107[3] = (byte) local175;
					if (arg2 - local165 <= 512) {
						local179 = 0;
					}
					Static670.aByteArray107[4] = (byte) (local179 >> 16);
					Static670.aByteArray107[5] = (byte) (local179 >> 8);
					Static670.aByteArray107[6] = (byte) local179;
					Static670.aByteArray107[7] = (byte) this.anInt7632;
					this.aClass238_5.method5542((long) (local68 * 520));
					this.aClass238_5.method5535(0, Static670.aByteArray107, 8);
					local214 = arg2 - local165;
					if (local214 > 512) {
						local214 = 512;
					}
					this.aClass238_5.method5535(local165, arg0, local214);
					local175++;
					local68 = local179;
					local165 += local214;
				}
				return true;
			} catch (@Pc(434) IOException local434) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)[B")
	public byte[] method6616(@OriginalArg(1) int arg0) {
		@Pc(8) Class238 local8 = this.aClass238_5;
		synchronized (this.aClass238_5) {
			try {
				if (this.aClass238_6.method5532() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass238_6.method5542((long) (arg0 * 6));
				this.aClass238_6.method5543(0, 6, Static670.aByteArray107);
				@Pc(74) int local74 = (Static670.aByteArray107[2] & 0xFF) + ((Static670.aByteArray107[1] & 0xFF) << 8) + ((Static670.aByteArray107[0] & 0xFF) << 16);
				@Pc(96) int local96 = (Static670.aByteArray107[5] & 0xFF) + ((Static670.aByteArray107[4] & 0xFF) << 8) + ((Static670.aByteArray107[3] & 0xFF) << 16);
				if (local74 < 0 || this.anInt7633 < local74) {
					return null;
				} else if (local96 > 0 && this.aClass238_5.method5532() / 520L >= (long) local96) {
					@Pc(136) byte[] local136 = new byte[local74];
					@Pc(138) int local138 = 0;
					@Pc(140) int local140 = 0;
					while (local74 > local138) {
						if (local96 == 0) {
							return null;
						}
						this.aClass238_5.method5542((long) (local96 * 520));
						@Pc(162) int local162 = local74 - local138;
						if (local162 > 512) {
							local162 = 512;
						}
						this.aClass238_5.method5543(0, local162 + 8, Static670.aByteArray107);
						@Pc(190) int local190 = (Static670.aByteArray107[1] & 0xFF) + ((Static670.aByteArray107[0] & 0xFF) << 8);
						@Pc(205) int local205 = ((Static670.aByteArray107[2] & 0xFF) << 8) + (Static670.aByteArray107[3] & 0xFF);
						@Pc(227) int local227 = (Static670.aByteArray107[6] & 0xFF) + ((Static670.aByteArray107[4] & 0xFF) << 16) + ((Static670.aByteArray107[5] & 0xFF) << 8);
						@Pc(233) int local233 = Static670.aByteArray107[7] & 0xFF;
						if (arg0 == local190 && local205 == local140 && local233 == this.anInt7632) {
							if (local227 >= 0 && this.aClass238_5.method5532() / 520L >= (long) local227) {
								for (@Pc(284) int local284 = 0; local284 < local162; local284++) {
									local136[local138++] = Static670.aByteArray107[local284 + 8];
								}
								local140++;
								local96 = local227;
								continue;
							}
							return null;
						}
						return null;
					}
					return local136;
				} else {
					return null;
				}
			} catch (@Pc(316) IOException local316) {
				return null;
			}
		}
	}
}
