import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class73 {

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
	private int anInt2694 = 65000;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!be;")
	private Class13 aClass13_2 = null;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Lclient!be;")
	private Class13 aClass13_3 = null;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
	private int anInt2692;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(ILclient!be;Lclient!be;I)V")
	public Class73(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) int arg3) {
		this.aClass13_2 = arg2;
		this.anInt2694 = arg3;
		this.anInt2692 = arg0;
		this.aClass13_3 = arg1;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)[B")
	public byte[] method2092(@OriginalArg(0) int arg0) {
		@Pc(8) Class13 local8 = this.aClass13_3;
		synchronized (this.aClass13_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass13_2.method347()) {
					return null;
				}
				this.aClass13_2.method357((long) (arg0 * 6));
				this.aClass13_2.method355(6, Static27.aByteArray16, 0);
				@Pc(65) int local65 = ((Static27.aByteArray16[1] & 0xFF) << 8) + (Static27.aByteArray16[0] << 16 & 0xFF0000) + (Static27.aByteArray16[2] & 0xFF);
				@Pc(87) int local87 = (Static27.aByteArray16[5] & 0xFF) + ((Static27.aByteArray16[4] & 0xFF) << 8) + ((Static27.aByteArray16[3] & 0xFF) << 16);
				if (local65 < 0 || local65 > this.anInt2694) {
					return null;
				} else if (local87 > 0 && (long) local87 <= this.aClass13_3.method347() / 520L) {
					@Pc(124) byte[] local124 = new byte[local65];
					@Pc(134) int local134 = 0;
					@Pc(136) int local136 = 0;
					while (local134 < local65) {
						if (local87 == 0) {
							return null;
						}
						@Pc(151) int local151 = local65 - local134;
						if (local151 > 512) {
							local151 = 512;
						}
						this.aClass13_3.method357((long) (local87 * 520));
						this.aClass13_3.method355(local151 + 8, Static27.aByteArray16, 0);
						@Pc(187) int local187 = ((Static27.aByteArray16[2] & 0xFF) << 8) + (Static27.aByteArray16[3] & 0xFF);
						@Pc(201) int local201 = ((Static27.aByteArray16[0] & 0xFF) << 8) + (Static27.aByteArray16[1] & 0xFF);
						@Pc(207) int local207 = Static27.aByteArray16[7] & 0xFF;
						@Pc(229) int local229 = (Static27.aByteArray16[6] & 0xFF) + ((Static27.aByteArray16[4] & 0xFF) << 16) + ((Static27.aByteArray16[5] & 0xFF) << 8);
						if (arg0 == local201 && local187 == local136 && local207 == this.anInt2692) {
							if (local229 >= 0 && (long) local229 <= this.aClass13_3.method347() / 520L) {
								for (@Pc(280) int local280 = 0; local280 < local151; local280++) {
									local124[local134++] = Static27.aByteArray16[local280 + 8];
								}
								local136++;
								local87 = local229;
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

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[BIIZ)Z")
	private boolean method2094(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class13 local8 = this.aClass13_3;
		synchronized (this.aClass13_3) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if ((long) (arg2 * 6 + 6) > this.aClass13_2.method347()) {
						return false;
					}
					this.aClass13_2.method357((long) (arg2 * 6));
					this.aClass13_2.method355(6, Static27.aByteArray16, 0);
					local22 = ((Static27.aByteArray16[3] & 0xFF) << 16) - (-(Static27.aByteArray16[4] << 8 & 0xFF00) - (Static27.aByteArray16[5] & 0xFF));
					if (local22 <= 0 || (long) local22 > this.aClass13_3.method347() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass13_3.method347() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static27.aByteArray16[5] = (byte) local22;
				Static27.aByteArray16[3] = (byte) (local22 >> 16);
				@Pc(120) int local120 = 0;
				Static27.aByteArray16[0] = (byte) (arg1 >> 16);
				@Pc(129) int local129 = 0;
				Static27.aByteArray16[1] = (byte) (arg1 >> 8);
				Static27.aByteArray16[4] = (byte) (local22 >> 8);
				Static27.aByteArray16[2] = (byte) arg1;
				this.aClass13_2.method357((long) (arg2 * 6));
				this.aClass13_2.method349(6, Static27.aByteArray16, 0);
				while (local129 < arg1) {
					@Pc(167) int local167 = 0;
					@Pc(202) int local202;
					if (arg3) {
						this.aClass13_3.method357((long) (local22 * 520));
						try {
							this.aClass13_3.method355(8, Static27.aByteArray16, 0);
						} catch (@Pc(186) EOFException local186) {
							return true;
						}
						local202 = (Static27.aByteArray16[1] & 0xFF) + ((Static27.aByteArray16[0] & 0xFF) << 8);
						@Pc(216) int local216 = (Static27.aByteArray16[3] & 0xFF) + ((Static27.aByteArray16[2] & 0xFF) << 8);
						@Pc(222) int local222 = Static27.aByteArray16[7] & 0xFF;
						local167 = ((Static27.aByteArray16[5] & 0xFF) << 8) + ((Static27.aByteArray16[4] & 0xFF) << 16) + (Static27.aByteArray16[6] & 0xFF);
						if (arg2 != local202 || local216 != local120 || this.anInt2692 != local222) {
							return false;
						}
						if (local167 < 0 || this.aClass13_3.method347() / 520L < (long) local167) {
							return false;
						}
					}
					if (local167 == 0) {
						local167 = (int) ((this.aClass13_3.method347() + 519L) / 520L);
						arg3 = false;
						if (local167 == 0) {
							local167++;
						}
						if (local167 == local22) {
							local167++;
						}
					}
					Static27.aByteArray16[3] = (byte) local120;
					if (arg1 - local129 <= 512) {
						local167 = 0;
					}
					Static27.aByteArray16[5] = (byte) (local167 >> 8);
					Static27.aByteArray16[7] = (byte) this.anInt2692;
					Static27.aByteArray16[0] = (byte) (arg2 >> 8);
					Static27.aByteArray16[6] = (byte) local167;
					Static27.aByteArray16[1] = (byte) arg2;
					Static27.aByteArray16[2] = (byte) (local120 >> 8);
					local202 = arg1 - local129;
					Static27.aByteArray16[4] = (byte) (local167 >> 16);
					this.aClass13_3.method357((long) (local22 * 520));
					local120++;
					this.aClass13_3.method349(8, Static27.aByteArray16, 0);
					if (local202 > 512) {
						local202 = 512;
					}
					local22 = local167;
					this.aClass13_3.method349(local202, arg0, local129);
					local129 += local202;
				}
				return true;
			} catch (@Pc(413) IOException local413) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2692;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[BII)Z")
	public boolean method2096(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class13 local6 = this.aClass13_3;
		synchronized (this.aClass13_3) {
			if (arg2 < 0 || this.anInt2694 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method2094(arg1, arg2, arg0, true);
			if (!local38) {
				local38 = this.method2094(arg1, arg2, arg0, false);
			}
			return local38;
		}
	}
}
