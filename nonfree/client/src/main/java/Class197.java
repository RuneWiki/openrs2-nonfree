import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class197 {

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Lclient!r;")
	private Class174 aClass174_4 = null;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	private int anInt5858 = 65000;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "Lclient!r;")
	private Class174 aClass174_5 = null;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	private final int anInt5860;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(ILclient!r;Lclient!r;I)V")
	public Class197(@OriginalArg(0) int arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) Class174 arg2, @OriginalArg(3) int arg3) {
		this.aClass174_4 = arg1;
		this.anInt5858 = arg3;
		this.aClass174_5 = arg2;
		this.anInt5860 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BII)Z")
	public boolean method5301(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class174 local11 = this.aClass174_4;
		synchronized (this.aClass174_4) {
			if (arg2 < 0 || arg2 > this.anInt5858) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method5303(arg2, arg0, true, arg1);
			if (!local34) {
				local34 = this.method5303(arg2, arg0, false, arg1);
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!uf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5860;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BZZI)Z")
	private boolean method5303(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class174 local8 = this.aClass174_4;
		synchronized (this.aClass174_4) {
			try {
				@Pc(72) int local72;
				if (arg2) {
					if ((long) (arg3 * 6 + 6) > this.aClass174_5.method4537()) {
						return false;
					}
					this.aClass174_5.method4530((long) (arg3 * 6));
					this.aClass174_5.method4535(6, 0, Static258.aByteArray72);
					local72 = (Static258.aByteArray72[5] & 0xFF) + (((Static258.aByteArray72[3] & 0xFF) << 16) + ((Static258.aByteArray72[4] & 0xFF) << 8));
					if (local72 <= 0 || this.aClass174_4.method4537() / 520L < (long) local72) {
						return false;
					}
				} else {
					local72 = (int) ((this.aClass174_4.method4537() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static258.aByteArray72[2] = (byte) arg0;
				Static258.aByteArray72[4] = (byte) (local72 >> 8);
				Static258.aByteArray72[0] = (byte) (arg0 >> 16);
				Static258.aByteArray72[3] = (byte) (local72 >> 16);
				Static258.aByteArray72[5] = (byte) local72;
				Static258.aByteArray72[1] = (byte) (arg0 >> 8);
				this.aClass174_5.method4530((long) (arg3 * 6));
				this.aClass174_5.method4532(Static258.aByteArray72, 6, 0);
				@Pc(171) int local171 = 0;
				@Pc(173) int local173 = 0;
				while (local171 < arg0) {
					@Pc(177) int local177 = 0;
					@Pc(212) int local212;
					if (arg2) {
						this.aClass174_4.method4530((long) (local72 * 520));
						try {
							this.aClass174_4.method4535(8, 0, Static258.aByteArray72);
						} catch (@Pc(196) EOFException local196) {
							return true;
						}
						local212 = (Static258.aByteArray72[1] & 0xFF) + ((Static258.aByteArray72[0] & 0xFF) << 8);
						local177 = ((Static258.aByteArray72[5] & 0xFF) << 8) + ((Static258.aByteArray72[4] & 0xFF) << 16) + (Static258.aByteArray72[6] & 0xFF);
						@Pc(248) int local248 = ((Static258.aByteArray72[2] & 0xFF) << 8) + (Static258.aByteArray72[3] & 0xFF);
						@Pc(254) int local254 = Static258.aByteArray72[7] & 0xFF;
						if (arg3 != local212 || local248 != local173 || local254 != this.anInt5860) {
							return false;
						}
						if (local177 < 0 || (long) local177 > this.aClass174_4.method4537() / 520L) {
							return false;
						}
					}
					if (local177 == 0) {
						arg2 = false;
						local177 = (int) ((this.aClass174_4.method4537() + 519L) / 520L);
						if (local177 == 0) {
							local177++;
						}
						if (local177 == local72) {
							local177++;
						}
					}
					Static258.aByteArray72[1] = (byte) arg3;
					Static258.aByteArray72[0] = (byte) (arg3 >> 8);
					Static258.aByteArray72[2] = (byte) (local173 >> 8);
					Static258.aByteArray72[3] = (byte) local173;
					if (arg0 - local171 <= 512) {
						local177 = 0;
					}
					Static258.aByteArray72[7] = (byte) this.anInt5860;
					Static258.aByteArray72[5] = (byte) (local177 >> 8);
					Static258.aByteArray72[4] = (byte) (local177 >> 16);
					Static258.aByteArray72[6] = (byte) local177;
					this.aClass174_4.method4530((long) (local72 * 520));
					this.aClass174_4.method4532(Static258.aByteArray72, 8, 0);
					local212 = arg0 - local171;
					if (local212 > 512) {
						local212 = 512;
					}
					this.aClass174_4.method4532(arg1, local212, local171);
					local173++;
					local72 = local177;
					local171 += local212;
				}
				return true;
			} catch (@Pc(442) IOException local442) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[B")
	public byte[] method5307(@OriginalArg(1) int arg0) {
		@Pc(8) Class174 local8 = this.aClass174_4;
		synchronized (this.aClass174_4) {
			try {
				if (this.aClass174_5.method4537() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass174_5.method4530((long) (arg0 * 6));
				this.aClass174_5.method4535(6, 0, Static258.aByteArray72);
				@Pc(72) int local72 = (Static258.aByteArray72[2] & 0xFF) + ((Static258.aByteArray72[0] & 0xFF) << 16) + ((Static258.aByteArray72[1] & 0xFF) << 8);
				@Pc(96) int local96 = ((Static258.aByteArray72[3] & 0xFF) << 16) - (-((Static258.aByteArray72[4] & 0xFF) << 8) - (Static258.aByteArray72[5] & 0xFF));
				if (local72 < 0 || local72 > this.anInt5858) {
					return null;
				} else if (local96 > 0 && (long) local96 <= this.aClass174_4.method4537() / 520L) {
					@Pc(143) byte[] local143 = new byte[local72];
					@Pc(145) int local145 = 0;
					@Pc(156) int local156 = 0;
					while (local72 > local145) {
						if (local96 == 0) {
							return null;
						}
						this.aClass174_4.method4530((long) (local96 * 520));
						@Pc(182) int local182 = local72 - local145;
						if (local182 > 512) {
							local182 = 512;
						}
						this.aClass174_4.method4535(local182 + 8, 0, Static258.aByteArray72);
						@Pc(210) int local210 = ((Static258.aByteArray72[0] & 0xFF) << 8) + (Static258.aByteArray72[1] & 0xFF);
						@Pc(224) int local224 = (Static258.aByteArray72[3] & 0xFF) + ((Static258.aByteArray72[2] & 0xFF) << 8);
						@Pc(247) int local247 = ((Static258.aByteArray72[4] & 0xFF) << 16) + ((Static258.aByteArray72[5] & 0xFF) << 8) + (Static258.aByteArray72[6] & 0xFF);
						@Pc(253) int local253 = Static258.aByteArray72[7] & 0xFF;
						if (arg0 == local210 && local224 == local156 && local253 == this.anInt5860) {
							if (local247 >= 0 && (long) local247 <= this.aClass174_4.method4537() / 520L) {
								for (@Pc(299) int local299 = 0; local299 < local182; local299++) {
									local143[local145++] = Static258.aByteArray72[local299 + 8];
								}
								local96 = local247;
								local156++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local143;
				} else {
					return null;
				}
			} catch (@Pc(335) IOException local335) {
				return null;
			}
		}
	}
}
