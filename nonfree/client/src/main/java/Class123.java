import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class123 {

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!ie;")
	private Class53 aClass53_4 = null;

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
	private int anInt4298 = 65000;

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "Lclient!ie;")
	private Class53 aClass53_5 = null;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
	private int anInt4296;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(ILclient!ie;Lclient!ie;I)V")
	public Class123(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) int arg3) {
		this.anInt4298 = arg3;
		this.aClass53_5 = arg2;
		this.anInt4296 = arg0;
		this.aClass53_4 = arg1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([BIII)Z")
	public boolean method3390(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class53 local6 = this.aClass53_4;
		synchronized (this.aClass53_4) {
			if (arg2 < 0 || this.anInt4298 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method3392(arg0, true, arg2, arg1);
			if (!local35) {
				local35 = this.method3392(arg0, false, arg2, arg1);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[B")
	public byte[] method3391(@OriginalArg(1) int arg0) {
		@Pc(8) Class53 local8 = this.aClass53_4;
		synchronized (this.aClass53_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass53_5.method1437()) {
					return null;
				}
				this.aClass53_5.method1441((long) (arg0 * 6));
				this.aClass53_5.method1435(Static19.aByteArray2, 6, 0);
				@Pc(66) int local66 = ((Static19.aByteArray2[1] & 0xFF) << 8) + ((Static19.aByteArray2[0] & 0xFF) << 16) + (Static19.aByteArray2[2] & 0xFF);
				@Pc(88) int local88 = ((Static19.aByteArray2[4] & 0xFF) << 8) + ((Static19.aByteArray2[3] & 0xFF) << 16) + (Static19.aByteArray2[5] & 0xFF);
				if (local66 < 0 || this.anInt4298 < local66) {
					return null;
				} else if (local88 > 0 && this.aClass53_4.method1437() / 520L >= (long) local88) {
					@Pc(129) byte[] local129 = new byte[local66];
					@Pc(131) int local131 = 0;
					@Pc(133) int local133 = 0;
					while (local66 > local133) {
						if (local88 == 0) {
							return null;
						}
						this.aClass53_4.method1441((long) (local88 * 520));
						@Pc(159) int local159 = local66 - local133;
						if (local159 > 512) {
							local159 = 512;
						}
						this.aClass53_4.method1435(Static19.aByteArray2, local159 + 8, 0);
						@Pc(197) int local197 = ((Static19.aByteArray2[4] & 0xFF) << 16) + ((Static19.aByteArray2[5] & 0xFF) << 8) + (Static19.aByteArray2[6] & 0xFF);
						@Pc(211) int local211 = ((Static19.aByteArray2[0] & 0xFF) << 8) + (Static19.aByteArray2[1] & 0xFF);
						@Pc(225) int local225 = (Static19.aByteArray2[3] & 0xFF) + ((Static19.aByteArray2[2] & 0xFF) << 8);
						@Pc(231) int local231 = Static19.aByteArray2[7] & 0xFF;
						if (arg0 == local211 && local131 == local225 && this.anInt4296 == local231) {
							if (local197 >= 0 && this.aClass53_4.method1437() / 520L >= (long) local197) {
								local88 = local197;
								for (@Pc(276) int local276 = 0; local276 < local159; local276++) {
									local129[local133++] = Static19.aByteArray2[local276 + 8];
								}
								local131++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local129;
				} else {
					return null;
				}
			} catch (@Pc(302) IOException local302) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4296;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([BIZII)Z")
	private boolean method3392(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class53 local8 = this.aClass53_4;
		synchronized (this.aClass53_4) {
			try {
				@Pc(73) int local73;
				if (arg1) {
					if (this.aClass53_5.method1437() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass53_5.method1441((long) (arg3 * 6));
					this.aClass53_5.method1435(Static19.aByteArray2, 6, 0);
					local73 = ((Static19.aByteArray2[3] & 0xFF) << 16) - (-(Static19.aByteArray2[4] << 8 & 0xFF00) - (Static19.aByteArray2[5] & 0xFF));
					if (local73 <= 0 || (long) local73 > this.aClass53_4.method1437() / 520L) {
						return false;
					}
				} else {
					local73 = (int) ((this.aClass53_4.method1437() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				Static19.aByteArray2[3] = (byte) (local73 >> 16);
				Static19.aByteArray2[4] = (byte) (local73 >> 8);
				Static19.aByteArray2[2] = (byte) arg2;
				Static19.aByteArray2[5] = (byte) local73;
				Static19.aByteArray2[0] = (byte) (arg2 >> 16);
				Static19.aByteArray2[1] = (byte) (arg2 >> 8);
				this.aClass53_5.method1441((long) (arg3 * 6));
				this.aClass53_5.method1440(Static19.aByteArray2, 0, 6);
				@Pc(180) int local180 = 0;
				@Pc(182) int local182 = 0;
				while (arg2 > local180) {
					@Pc(186) int local186 = 0;
					@Pc(222) int local222;
					if (arg1) {
						this.aClass53_4.method1441((long) (local73 * 520));
						try {
							this.aClass53_4.method1435(Static19.aByteArray2, 8, 0);
						} catch (@Pc(205) EOFException local205) {
							return true;
						}
						local222 = ((Static19.aByteArray2[0] & 0xFF) << 8) + (Static19.aByteArray2[1] & 0xFF);
						local186 = (Static19.aByteArray2[6] & 0xFF) + ((Static19.aByteArray2[5] & 0xFF) << 8) + ((Static19.aByteArray2[4] & 0xFF) << 16);
						@Pc(259) int local259 = ((Static19.aByteArray2[2] & 0xFF) << 8) + (Static19.aByteArray2[3] & 0xFF);
						@Pc(265) int local265 = Static19.aByteArray2[7] & 0xFF;
						if (local222 != arg3 || local259 != local182 || local265 != this.anInt4296) {
							return false;
						}
						if (local186 < 0 || this.aClass53_4.method1437() / 520L < (long) local186) {
							return false;
						}
					}
					if (local186 == 0) {
						local186 = (int) ((this.aClass53_4.method1437() + 519L) / 520L);
						arg1 = false;
						if (local186 == 0) {
							local186++;
						}
						if (local186 == local73) {
							local186++;
						}
					}
					Static19.aByteArray2[7] = (byte) this.anInt4296;
					Static19.aByteArray2[0] = (byte) (arg3 >> 8);
					Static19.aByteArray2[3] = (byte) local182;
					Static19.aByteArray2[2] = (byte) (local182 >> 8);
					if (arg2 - local180 <= 512) {
						local186 = 0;
					}
					Static19.aByteArray2[6] = (byte) local186;
					Static19.aByteArray2[5] = (byte) (local186 >> 8);
					Static19.aByteArray2[1] = (byte) arg3;
					local182++;
					local222 = arg2 - local180;
					Static19.aByteArray2[4] = (byte) (local186 >> 16);
					this.aClass53_4.method1441((long) (local73 * 520));
					this.aClass53_4.method1440(Static19.aByteArray2, 0, 8);
					local73 = local186;
					if (local222 > 512) {
						local222 = 512;
					}
					this.aClass53_4.method1440(arg0, local180, local222);
					local180 += local222;
				}
				return true;
			} catch (@Pc(437) IOException local437) {
				return false;
			}
		}
	}
}
