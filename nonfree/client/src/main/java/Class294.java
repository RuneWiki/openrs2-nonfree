import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class294 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	private int anInt8859 = 65000;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!ah;")
	private Class9 aClass9_2 = null;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!ah;")
	private Class9 aClass9_3 = null;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	private final int anInt8856;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(ILclient!ah;Lclient!ah;I)V")
	public Class294(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) int arg3) {
		this.aClass9_3 = arg2;
		this.anInt8859 = arg3;
		this.aClass9_2 = arg1;
		this.anInt8856 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[BIZ)Z")
	private boolean method7259(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class9 local8 = this.aClass9_2;
		synchronized (this.aClass9_2) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if (this.aClass9_3.method367() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass9_3.method371((long) (arg2 * 6));
					this.aClass9_3.method369(Static207.aByteArray56, 6, 0);
					local22 = ((Static207.aByteArray56[3] & 0xFF) << 16) - (-((Static207.aByteArray56[4] & 0xFF) << 8) - (Static207.aByteArray56[5] & 0xFF));
					if (local22 <= 0 || (long) local22 > this.aClass9_2.method367() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass9_2.method367() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static207.aByteArray56[5] = (byte) local22;
				Static207.aByteArray56[3] = (byte) (local22 >> 16);
				Static207.aByteArray56[1] = (byte) (arg0 >> 8);
				Static207.aByteArray56[4] = (byte) (local22 >> 8);
				Static207.aByteArray56[2] = (byte) arg0;
				Static207.aByteArray56[0] = (byte) (arg0 >> 16);
				this.aClass9_3.method371((long) (arg2 * 6));
				this.aClass9_3.method375(Static207.aByteArray56, 0, 6);
				@Pc(167) int local167 = 0;
				@Pc(169) int local169 = 0;
				while (local167 < arg0) {
					@Pc(173) int local173 = 0;
					@Pc(208) int local208;
					if (arg3) {
						this.aClass9_2.method371((long) (local22 * 520));
						try {
							this.aClass9_2.method369(Static207.aByteArray56, 8, 0);
						} catch (@Pc(192) EOFException local192) {
							return true;
						}
						local208 = ((Static207.aByteArray56[0] & 0xFF) << 8) + (Static207.aByteArray56[1] & 0xFF);
						@Pc(222) int local222 = (Static207.aByteArray56[3] & 0xFF) + ((Static207.aByteArray56[2] & 0xFF) << 8);
						local173 = (Static207.aByteArray56[6] & 0xFF) + ((Static207.aByteArray56[5] & 0xFF) << 8) + ((Static207.aByteArray56[4] & 0xFF) << 16);
						@Pc(250) int local250 = Static207.aByteArray56[7] & 0xFF;
						if (arg2 != local208 || local222 != local169 || local250 != this.anInt8856) {
							return false;
						}
						if (local173 < 0 || this.aClass9_2.method367() / 520L < (long) local173) {
							return false;
						}
					}
					if (local173 == 0) {
						local173 = (int) ((this.aClass9_2.method367() + 519L) / 520L);
						arg3 = false;
						if (local173 == 0) {
							local173++;
						}
						if (local173 == local22) {
							local173++;
						}
					}
					if (arg0 - local167 <= 512) {
						local173 = 0;
					}
					Static207.aByteArray56[0] = (byte) (arg2 >> 8);
					Static207.aByteArray56[3] = (byte) local169;
					Static207.aByteArray56[1] = (byte) arg2;
					Static207.aByteArray56[2] = (byte) (local169 >> 8);
					Static207.aByteArray56[7] = (byte) this.anInt8856;
					Static207.aByteArray56[5] = (byte) (local173 >> 8);
					Static207.aByteArray56[4] = (byte) (local173 >> 16);
					Static207.aByteArray56[6] = (byte) local173;
					this.aClass9_2.method371((long) (local22 * 520));
					this.aClass9_2.method375(Static207.aByteArray56, 0, 8);
					local208 = arg0 - local167;
					if (local208 > 512) {
						local208 = 512;
					}
					this.aClass9_2.method375(arg1, local167, local208);
					local167 += local208;
					local22 = local173;
					local169++;
				}
				return true;
			} catch (@Pc(433) IOException local433) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([BIII)Z")
	public boolean method7260(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class9 local6 = this.aClass9_2;
		synchronized (this.aClass9_2) {
			if (arg1 < 0 || this.anInt8859 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method7259(arg1, arg0, arg2, true);
			if (!local31) {
				local31 = this.method7259(arg1, arg0, arg2, false);
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!sd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt8856;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[B")
	public byte[] method7262(@OriginalArg(1) int arg0) {
		@Pc(12) Class9 local12 = this.aClass9_2;
		synchronized (this.aClass9_2) {
			try {
				if (this.aClass9_3.method367() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass9_3.method371((long) (arg0 * 6));
				this.aClass9_3.method369(Static207.aByteArray56, 6, 0);
				@Pc(69) int local69 = (Static207.aByteArray56[2] & 0xFF) + ((Static207.aByteArray56[1] & 0xFF) << 8) + ((Static207.aByteArray56[0] & 0xFF) << 16);
				@Pc(91) int local91 = ((Static207.aByteArray56[4] & 0xFF) << 8) + (Static207.aByteArray56[3] << 16 & 0xFF0000) + (Static207.aByteArray56[5] & 0xFF);
				if (local69 < 0 || this.anInt8859 < local69) {
					return null;
				} else if (local91 > 0 && (long) local91 <= this.aClass9_2.method367() / 520L) {
					@Pc(127) byte[] local127 = new byte[local69];
					@Pc(129) int local129 = 0;
					@Pc(131) int local131 = 0;
					while (local69 > local129) {
						if (local91 == 0) {
							return null;
						}
						this.aClass9_2.method371((long) (local91 * 520));
						@Pc(156) int local156 = local69 - local129;
						if (local156 > 512) {
							local156 = 512;
						}
						this.aClass9_2.method369(Static207.aByteArray56, local156 + 8, 0);
						@Pc(187) int local187 = ((Static207.aByteArray56[0] & 0xFF) << 8) + (Static207.aByteArray56[1] & 0xFF);
						@Pc(202) int local202 = ((Static207.aByteArray56[2] & 0xFF) << 8) + (Static207.aByteArray56[3] & 0xFF);
						@Pc(225) int local225 = (Static207.aByteArray56[6] & 0xFF) + (((Static207.aByteArray56[4] & 0xFF) << 16) + ((Static207.aByteArray56[5] & 0xFF) << 8));
						@Pc(231) int local231 = Static207.aByteArray56[7] & 0xFF;
						if (local187 == arg0 && local131 == local202 && local231 == this.anInt8856) {
							if (local225 >= 0 && this.aClass9_2.method367() / 520L >= (long) local225) {
								local131++;
								for (@Pc(280) int local280 = 0; local280 < local156; local280++) {
									local127[local129++] = Static207.aByteArray56[local280 + 8];
								}
								local91 = local225;
								continue;
							}
							return null;
						}
						return null;
					}
					return local127;
				} else {
					return null;
				}
			} catch (@Pc(306) IOException local306) {
				return null;
			}
		}
	}
}
