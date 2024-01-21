import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class70 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
	private int anInt2658 = 65000;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "Lclient!o;")
	private Class54 aClass54_3 = null;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!o;")
	private Class54 aClass54_4 = null;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
	private final int anInt2669;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(ILclient!o;Lclient!o;I)V")
	public Class70(@OriginalArg(0) int arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) int arg3) {
		this.anInt2669 = arg0;
		this.aClass54_3 = arg2;
		this.aClass54_4 = arg1;
		this.anInt2658 = arg3;
	}

	@OriginalMember(owner = "client!sa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2669;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[B")
	public byte[] method1881(@OriginalArg(1) int arg0) {
		@Pc(8) Class54 local8 = this.aClass54_4;
		synchronized (this.aClass54_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass54_3.method1498()) {
					return null;
				}
				this.aClass54_3.method1496((long) (arg0 * 6));
				this.aClass54_3.method1501(0, 6, Static40.aByteArray22);
				@Pc(69) int local69 = ((Static40.aByteArray22[1] & 0xFF) << 8) + ((Static40.aByteArray22[0] & 0xFF) << 16) + (Static40.aByteArray22[2] & 0xFF);
				@Pc(97) int local97 = (Static40.aByteArray22[5] & 0xFF) + ((Static40.aByteArray22[3] & 0xFF) << 16) + ((Static40.aByteArray22[4] & 0xFF) << 8);
				if (local69 < 0 || this.anInt2658 < local69) {
					return null;
				} else if (local97 > 0 && this.aClass54_4.method1498() / 520L >= (long) local97) {
					@Pc(137) int local137 = 0;
					@Pc(140) byte[] local140 = new byte[local69];
					@Pc(142) int local142 = 0;
					while (local137 < local69) {
						if (local97 == 0) {
							return null;
						}
						this.aClass54_4.method1496((long) (local97 * 520));
						@Pc(167) int local167 = local69 - local137;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass54_4.method1501(0, local167 + 8, Static40.aByteArray22);
						@Pc(199) int local199 = (Static40.aByteArray22[1] & 0xFF) + ((Static40.aByteArray22[0] & 0xFF) << 8);
						@Pc(213) int local213 = ((Static40.aByteArray22[2] & 0xFF) << 8) + (Static40.aByteArray22[3] & 0xFF);
						@Pc(219) int local219 = Static40.aByteArray22[7] & 0xFF;
						@Pc(241) int local241 = ((Static40.aByteArray22[4] & 0xFF) << 16) + ((Static40.aByteArray22[5] & 0xFF) << 8) + (Static40.aByteArray22[6] & 0xFF);
						if (local199 == arg0 && local142 == local213 && local219 == this.anInt2669) {
							if (local241 >= 0 && this.aClass54_4.method1498() / 520L >= (long) local241) {
								local142++;
								for (@Pc(293) int local293 = 0; local293 < local167; local293++) {
									local140[local137++] = Static40.aByteArray22[local293 + 8];
								}
								local97 = local241;
								continue;
							}
							return null;
						}
						return null;
					}
					return local140;
				} else {
					return null;
				}
			} catch (@Pc(320) IOException local320) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIII[B)Z")
	private boolean method1882(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class54 local8 = this.aClass54_4;
		synchronized (this.aClass54_4) {
			try {
				@Pc(28) int local28;
				if (arg0) {
					if (this.aClass54_3.method1498() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass54_3.method1496((long) (arg1 * 6));
					this.aClass54_3.method1501(0, 6, Static40.aByteArray22);
					local28 = (Static40.aByteArray22[5] & 0xFF) + ((Static40.aByteArray22[4] & 0xFF) << 8) + ((Static40.aByteArray22[3] & 0xFF) << 16);
					if (local28 <= 0 || this.aClass54_4.method1498() / 520L < (long) local28) {
						return false;
					}
				} else {
					local28 = (int) ((this.aClass54_4.method1498() + 519L) / 520L);
					if (local28 == 0) {
						local28 = 1;
					}
				}
				Static40.aByteArray22[0] = (byte) (arg2 >> 16);
				@Pc(120) int local120 = 0;
				Static40.aByteArray22[1] = (byte) (arg2 >> 8);
				Static40.aByteArray22[2] = (byte) arg2;
				Static40.aByteArray22[3] = (byte) (local28 >> 16);
				Static40.aByteArray22[5] = (byte) local28;
				Static40.aByteArray22[4] = (byte) (local28 >> 8);
				this.aClass54_3.method1496((long) (arg1 * 6));
				@Pc(161) int local161 = 0;
				this.aClass54_3.method1495(Static40.aByteArray22, 6, 0);
				while (arg2 > local120) {
					@Pc(172) int local172 = 0;
					@Pc(230) int local230;
					if (arg0) {
						this.aClass54_4.method1496((long) (local28 * 520));
						try {
							this.aClass54_4.method1501(0, 8, Static40.aByteArray22);
						} catch (@Pc(191) EOFException local191) {
							return true;
						}
						local172 = (Static40.aByteArray22[6] & 0xFF) + ((Static40.aByteArray22[5] & 0xFF) << 8) + ((Static40.aByteArray22[4] & 0xFF) << 16);
						local230 = ((Static40.aByteArray22[0] & 0xFF) << 8) + (Static40.aByteArray22[1] & 0xFF);
						@Pc(236) int local236 = Static40.aByteArray22[7] & 0xFF;
						@Pc(251) int local251 = ((Static40.aByteArray22[2] & 0xFF) << 8) + (Static40.aByteArray22[3] & 0xFF);
						if (local230 != arg1 || local251 != local161 || this.anInt2669 != local236) {
							return false;
						}
						if (local172 < 0 || (long) local172 > this.aClass54_4.method1498() / 520L) {
							return false;
						}
					}
					if (local172 == 0) {
						arg0 = false;
						local172 = (int) ((this.aClass54_4.method1498() + 519L) / 520L);
						if (local172 == 0) {
							local172++;
						}
						if (local28 == local172) {
							local172++;
						}
					}
					Static40.aByteArray22[3] = (byte) local161;
					Static40.aByteArray22[0] = (byte) (arg1 >> 8);
					if (arg2 - local120 <= 512) {
						local172 = 0;
					}
					Static40.aByteArray22[5] = (byte) (local172 >> 8);
					local230 = arg2 - local120;
					Static40.aByteArray22[1] = (byte) arg1;
					Static40.aByteArray22[4] = (byte) (local172 >> 16);
					Static40.aByteArray22[2] = (byte) (local161 >> 8);
					if (local230 > 512) {
						local230 = 512;
					}
					Static40.aByteArray22[6] = (byte) local172;
					Static40.aByteArray22[7] = (byte) this.anInt2669;
					this.aClass54_4.method1496((long) (local28 * 520));
					local28 = local172;
					this.aClass54_4.method1495(Static40.aByteArray22, 8, 0);
					local161++;
					this.aClass54_4.method1495(arg3, local230, local120);
					local120 += local230;
				}
				return true;
			} catch (@Pc(420) IOException local420) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI[BI)Z")
	public boolean method1883(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class54 local11 = this.aClass54_4;
		synchronized (this.aClass54_4) {
			if (arg0 < 0 || arg0 > this.anInt2658) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method1882(true, arg2, arg0, arg1);
			if (!local31) {
				local31 = this.method1882(false, arg2, arg0, arg1);
			}
			return local31;
		}
	}
}
