import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class64 {

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Lclient!wh;")
	private Class89 aClass89_3 = null;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	private int anInt3045 = 65000;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "Lclient!wh;")
	private Class89 aClass89_4 = null;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
	private final int anInt3047;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILclient!wh;Lclient!wh;I)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(3) int arg3) {
		this.anInt3047 = arg0;
		this.aClass89_3 = arg1;
		this.anInt3045 = arg3;
		this.aClass89_4 = arg2;
	}

	@OriginalMember(owner = "client!pg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3047;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[BZII)Z")
	private boolean method2162(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class89 local8 = this.aClass89_3;
		synchronized (this.aClass89_3) {
			try {
				@Pc(71) int local71;
				if (arg2) {
					if ((long) (arg3 * 6 + 6) > this.aClass89_4.method3021()) {
						return false;
					}
					this.aClass89_4.method3019((long) (arg3 * 6));
					this.aClass89_4.method3014(Static81.aByteArray35, 6, 0);
					local71 = ((Static81.aByteArray35[4] & 0xFF) << 8) + (Static81.aByteArray35[3] << 16 & 0xFF0000) + (Static81.aByteArray35[5] & 0xFF);
					if (local71 <= 0 || (long) local71 > this.aClass89_3.method3021() / 520L) {
						return false;
					}
				} else {
					local71 = (int) ((this.aClass89_3.method3021() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static81.aByteArray35[3] = (byte) (local71 >> 16);
				Static81.aByteArray35[2] = (byte) arg0;
				Static81.aByteArray35[1] = (byte) (arg0 >> 8);
				Static81.aByteArray35[4] = (byte) (local71 >> 8);
				Static81.aByteArray35[5] = (byte) local71;
				@Pc(143) int local143 = 0;
				Static81.aByteArray35[0] = (byte) (arg0 >> 16);
				@Pc(152) int local152 = 0;
				this.aClass89_4.method3019((long) (arg3 * 6));
				this.aClass89_4.method3010(0, 6, Static81.aByteArray35);
				while (arg0 > local143) {
					@Pc(177) int local177 = 0;
					@Pc(212) int local212;
					if (arg2) {
						this.aClass89_3.method3019((long) (local71 * 520));
						try {
							this.aClass89_3.method3014(Static81.aByteArray35, 8, 0);
						} catch (@Pc(196) EOFException local196) {
							return true;
						}
						local212 = ((Static81.aByteArray35[0] & 0xFF) << 8) + (Static81.aByteArray35[1] & 0xFF);
						local177 = ((Static81.aByteArray35[5] & 0xFF) << 8) + ((Static81.aByteArray35[4] & 0xFF) << 16) + (Static81.aByteArray35[6] & 0xFF);
						@Pc(248) int local248 = (Static81.aByteArray35[3] & 0xFF) + ((Static81.aByteArray35[2] & 0xFF) << 8);
						@Pc(254) int local254 = Static81.aByteArray35[7] & 0xFF;
						if (arg3 != local212 || local248 != local152 || this.anInt3047 != local254) {
							return false;
						}
						if (local177 < 0 || this.aClass89_3.method3021() / 520L < (long) local177) {
							return false;
						}
					}
					local212 = arg0 - local143;
					if (local177 == 0) {
						arg2 = false;
						local177 = (int) ((this.aClass89_3.method3021() + 519L) / 520L);
						if (local177 == 0) {
							local177++;
						}
						if (local71 == local177) {
							local177++;
						}
					}
					Static81.aByteArray35[7] = (byte) this.anInt3047;
					Static81.aByteArray35[1] = (byte) arg3;
					Static81.aByteArray35[3] = (byte) local152;
					if (local212 > 512) {
						local212 = 512;
					}
					Static81.aByteArray35[2] = (byte) (local152 >> 8);
					local152++;
					Static81.aByteArray35[0] = (byte) (arg3 >> 8);
					if (arg0 - local143 <= 512) {
						local177 = 0;
					}
					Static81.aByteArray35[6] = (byte) local177;
					Static81.aByteArray35[4] = (byte) (local177 >> 16);
					Static81.aByteArray35[5] = (byte) (local177 >> 8);
					this.aClass89_3.method3019((long) (local71 * 520));
					local71 = local177;
					this.aClass89_3.method3010(0, 8, Static81.aByteArray35);
					this.aClass89_3.method3010(local143, local212, arg1);
					local143 += local212;
				}
				return true;
			} catch (@Pc(437) IOException local437) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI[BI)Z")
	public boolean method2163(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class89 local11 = this.aClass89_3;
		synchronized (this.aClass89_3) {
			if (arg2 < 0 || this.anInt3045 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method2162(arg2, arg1, true, arg0);
			if (!local31) {
				local31 = this.method2162(arg2, arg1, false, arg0);
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)[B")
	public byte[] method2164(@OriginalArg(1) int arg0) {
		@Pc(8) Class89 local8 = this.aClass89_3;
		synchronized (this.aClass89_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass89_4.method3021()) {
					return null;
				}
				this.aClass89_4.method3019((long) (arg0 * 6));
				this.aClass89_4.method3014(Static81.aByteArray35, 6, 0);
				@Pc(69) int local69 = (Static81.aByteArray35[2] & 0xFF) + ((Static81.aByteArray35[1] & 0xFF) << 8) + ((Static81.aByteArray35[0] & 0xFF) << 16);
				@Pc(91) int local91 = (Static81.aByteArray35[5] & 0xFF) + ((Static81.aByteArray35[4] & 0xFF) << 8) + ((Static81.aByteArray35[3] & 0xFF) << 16);
				if (local69 < 0 || this.anInt3045 < local69) {
					return null;
				} else if (local91 > 0 && this.aClass89_3.method3021() / 520L >= (long) local91) {
					@Pc(126) int local126 = 0;
					@Pc(129) byte[] local129 = new byte[local69];
					@Pc(131) int local131 = 0;
					while (local69 > local126) {
						if (local91 == 0) {
							return null;
						}
						this.aClass89_3.method3019((long) (local91 * 520));
						@Pc(154) int local154 = local69 - local126;
						if (local154 > 512) {
							local154 = 512;
						}
						this.aClass89_3.method3014(Static81.aByteArray35, local154 + 8, 0);
						@Pc(182) int local182 = (Static81.aByteArray35[1] & 0xFF) + ((Static81.aByteArray35[0] & 0xFF) << 8);
						@Pc(188) int local188 = Static81.aByteArray35[7] & 0xFF;
						@Pc(203) int local203 = ((Static81.aByteArray35[2] & 0xFF) << 8) + (Static81.aByteArray35[3] & 0xFF);
						@Pc(225) int local225 = (Static81.aByteArray35[6] & 0xFF) + ((Static81.aByteArray35[5] & 0xFF) << 8) + ((Static81.aByteArray35[4] & 0xFF) << 16);
						if (arg0 == local182 && local203 == local131 && local188 == this.anInt3047) {
							if (local225 >= 0 && (long) local225 <= this.aClass89_3.method3021() / 520L) {
								local91 = local225;
								for (@Pc(275) int local275 = 0; local275 < local154; local275++) {
									local129[local126++] = Static81.aByteArray35[local275 + 8];
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
			} catch (@Pc(305) IOException local305) {
				return null;
			}
		}
	}
}
