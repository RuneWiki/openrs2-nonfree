import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class27 {

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Lclient!ea;")
	private Class21 aClass21_1 = null;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Lclient!ea;")
	private Class21 aClass21_2 = null;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	private int anInt1178 = 65000;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "I")
	private final int anInt1180;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILclient!ea;Lclient!ea;I)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) int arg3) {
		this.aClass21_1 = arg1;
		this.anInt1180 = arg0;
		this.anInt1178 = arg3;
		this.aClass21_2 = arg2;
	}

	@OriginalMember(owner = "client!f", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1180;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B[BIIZ)Z")
	private boolean method714(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class21 local8 = this.aClass21_1;
		synchronized (this.aClass21_1) {
			try {
				@Pc(69) int local69;
				if (arg3) {
					if ((long) (arg1 * 6 + 6) > this.aClass21_2.method591()) {
						return false;
					}
					this.aClass21_2.method600((long) (arg1 * 6));
					this.aClass21_2.method593(0, 6, Static33.aByteArray5);
					local69 = (Static33.aByteArray5[5] & 0xFF) + ((Static33.aByteArray5[4] & 0xFF) << 8) + ((Static33.aByteArray5[3] & 0xFF) << 16);
					if (local69 <= 0 || this.aClass21_1.method591() / 520L < (long) local69) {
						return false;
					}
				} else {
					local69 = (int) ((this.aClass21_1.method591() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				Static33.aByteArray5[3] = (byte) (local69 >> 16);
				Static33.aByteArray5[4] = (byte) (local69 >> 8);
				Static33.aByteArray5[0] = (byte) (arg2 >> 16);
				Static33.aByteArray5[2] = (byte) arg2;
				Static33.aByteArray5[1] = (byte) (arg2 >> 8);
				@Pc(153) int local153 = 0;
				Static33.aByteArray5[5] = (byte) local69;
				this.aClass21_2.method600((long) (arg1 * 6));
				this.aClass21_2.method590(6, Static33.aByteArray5, 0);
				@Pc(175) int local175 = 0;
				while (arg2 > local153) {
					@Pc(179) int local179 = 0;
					@Pc(242) int local242;
					if (arg3) {
						this.aClass21_1.method600((long) (local69 * 520));
						try {
							this.aClass21_1.method593(0, 8, Static33.aByteArray5);
						} catch (@Pc(198) EOFException local198) {
							return true;
						}
						local179 = (Static33.aByteArray5[6] & 0xFF) + ((Static33.aByteArray5[5] & 0xFF) << 8) + ((Static33.aByteArray5[4] & 0xFF) << 16);
						@Pc(228) int local228 = Static33.aByteArray5[7] & 0xFF;
						local242 = ((Static33.aByteArray5[0] & 0xFF) << 8) + (Static33.aByteArray5[1] & 0xFF);
						@Pc(256) int local256 = (Static33.aByteArray5[3] & 0xFF) + ((Static33.aByteArray5[2] & 0xFF) << 8);
						if (arg1 != local242 || local256 != local175 || local228 != this.anInt1180) {
							return false;
						}
						if (local179 < 0 || (long) local179 > this.aClass21_1.method591() / 520L) {
							return false;
						}
					}
					if (local179 == 0) {
						arg3 = false;
						local179 = (int) ((this.aClass21_1.method591() + 519L) / 520L);
						if (local179 == 0) {
							local179++;
						}
						if (local69 == local179) {
							local179++;
						}
					}
					if (arg2 - local153 <= 512) {
						local179 = 0;
					}
					local242 = arg2 - local153;
					Static33.aByteArray5[2] = (byte) (local175 >> 8);
					Static33.aByteArray5[6] = (byte) local179;
					Static33.aByteArray5[0] = (byte) (arg1 >> 8);
					if (local242 > 512) {
						local242 = 512;
					}
					Static33.aByteArray5[3] = (byte) local175;
					Static33.aByteArray5[7] = (byte) this.anInt1180;
					Static33.aByteArray5[1] = (byte) arg1;
					Static33.aByteArray5[4] = (byte) (local179 >> 16);
					Static33.aByteArray5[5] = (byte) (local179 >> 8);
					this.aClass21_1.method600((long) (local69 * 520));
					this.aClass21_1.method590(8, Static33.aByteArray5, 0);
					local69 = local179;
					local175++;
					this.aClass21_1.method590(local242, arg0, local153);
					local153 += local242;
				}
				return true;
			} catch (@Pc(435) IOException local435) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)[B")
	public byte[] method715(@OriginalArg(0) int arg0) {
		@Pc(8) Class21 local8 = this.aClass21_1;
		synchronized (this.aClass21_1) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass21_2.method591()) {
					return null;
				}
				this.aClass21_2.method600((long) (arg0 * 6));
				this.aClass21_2.method593(0, 6, Static33.aByteArray5);
				@Pc(65) int local65 = (Static33.aByteArray5[2] & 0xFF) + ((Static33.aByteArray5[1] & 0xFF) << 8) + ((Static33.aByteArray5[0] & 0xFF) << 16);
				@Pc(88) int local88 = ((Static33.aByteArray5[3] & 0xFF) << 16) + (((Static33.aByteArray5[4] & 0xFF) << 8) + (Static33.aByteArray5[5] & 0xFF));
				if (local65 < 0 || local65 > this.anInt1178) {
					return null;
				} else if (local88 > 0 && this.aClass21_1.method591() / 520L >= (long) local88) {
					@Pc(124) byte[] local124 = new byte[local65];
					@Pc(134) int local134 = 0;
					@Pc(136) int local136 = 0;
					while (local136 < local65) {
						if (local88 == 0) {
							return null;
						}
						@Pc(150) int local150 = local65 - local136;
						if (local150 > 512) {
							local150 = 512;
						}
						this.aClass21_1.method600((long) (local88 * 520));
						this.aClass21_1.method593(0, local150 + 8, Static33.aByteArray5);
						@Pc(186) int local186 = (Static33.aByteArray5[1] & 0xFF) + ((Static33.aByteArray5[0] & 0xFF) << 8);
						@Pc(192) int local192 = Static33.aByteArray5[7] & 0xFF;
						@Pc(214) int local214 = (Static33.aByteArray5[6] & 0xFF) + ((Static33.aByteArray5[5] & 0xFF) << 8) + ((Static33.aByteArray5[4] & 0xFF) << 16);
						@Pc(228) int local228 = (Static33.aByteArray5[3] & 0xFF) + ((Static33.aByteArray5[2] & 0xFF) << 8);
						if (arg0 == local186 && local228 == local134 && this.anInt1180 == local192) {
							if (local214 >= 0 && (long) local214 <= this.aClass21_1.method591() / 520L) {
								local88 = local214;
								for (@Pc(278) int local278 = 0; local278 < local150; local278++) {
									local124[local136++] = Static33.aByteArray5[local278 + 8];
								}
								local134++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local124;
				} else {
					return null;
				}
			} catch (@Pc(312) IOException local312) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II[BI)Z")
	public boolean method717(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class21 local6 = this.aClass21_1;
		synchronized (this.aClass21_1) {
			if (arg0 < 0 || this.anInt1178 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method714(arg1, arg2, arg0, true);
			if (!local35) {
				local35 = this.method714(arg1, arg2, arg0, false);
			}
			return local35;
		}
	}
}
