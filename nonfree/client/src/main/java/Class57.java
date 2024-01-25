import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class57 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Lclient!pm;")
	private Class259 aClass259_1 = null;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Lclient!pm;")
	private Class259 aClass259_2 = null;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
	private int anInt1845 = 65000;

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
	private final int anInt1850;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(ILclient!pm;Lclient!pm;I)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) int arg3) {
		this.anInt1845 = arg3;
		this.aClass259_1 = arg2;
		this.aClass259_2 = arg1;
		this.anInt1850 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III[B)Z")
	public boolean method1622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class259 local6 = this.aClass259_2;
		synchronized (this.aClass259_2) {
			if (arg0 < 0 || this.anInt1845 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(36) boolean local36 = this.method1624(arg2, arg0, arg1, true);
			if (!local36) {
				local36 = this.method1624(arg2, arg0, arg1, false);
			}
			return local36;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[BIIZ)Z")
	private boolean method1624(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class259 local8 = this.aClass259_2;
		synchronized (this.aClass259_2) {
			try {
				@Pc(71) int local71;
				if (arg3) {
					if (this.aClass259_1.method5775() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass259_1.method5774((long) (arg2 * 6));
					this.aClass259_1.method5769(Static525.aByteArray97, 6, 0);
					local71 = (Static525.aByteArray97[5] & 0xFF) + ((Static525.aByteArray97[3] & 0xFF) << 16) + ((Static525.aByteArray97[4] & 0xFF) << 8);
					if (local71 <= 0 || this.aClass259_2.method5775() / 520L < (long) local71) {
						return false;
					}
				} else {
					local71 = (int) ((this.aClass259_2.method5775() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static525.aByteArray97[4] = (byte) (local71 >> 8);
				Static525.aByteArray97[5] = (byte) local71;
				Static525.aByteArray97[0] = (byte) (arg1 >> 16);
				Static525.aByteArray97[1] = (byte) (arg1 >> 8);
				Static525.aByteArray97[2] = (byte) arg1;
				Static525.aByteArray97[3] = (byte) (local71 >> 16);
				this.aClass259_1.method5774((long) (arg2 * 6));
				this.aClass259_1.method5772(0, 6, Static525.aByteArray97);
				@Pc(174) int local174 = 0;
				@Pc(176) int local176 = 0;
				while (arg1 > local174) {
					@Pc(180) int local180 = 0;
					@Pc(215) int local215;
					if (arg3) {
						this.aClass259_2.method5774((long) (local71 * 520));
						try {
							this.aClass259_2.method5769(Static525.aByteArray97, 8, 0);
						} catch (@Pc(199) EOFException local199) {
							return true;
						}
						local215 = (Static525.aByteArray97[1] & 0xFF) + ((Static525.aByteArray97[0] & 0xFF) << 8);
						local180 = (Static525.aByteArray97[6] & 0xFF) + ((Static525.aByteArray97[5] & 0xFF) << 8) + ((Static525.aByteArray97[4] & 0xFF) << 16);
						@Pc(251) int local251 = (Static525.aByteArray97[3] & 0xFF) + ((Static525.aByteArray97[2] & 0xFF) << 8);
						@Pc(257) int local257 = Static525.aByteArray97[7] & 0xFF;
						if (arg2 != local215 || local251 != local176 || this.anInt1850 != local257) {
							return false;
						}
						if (local180 < 0 || (long) local180 > this.aClass259_2.method5775() / 520L) {
							return false;
						}
					}
					if (local180 == 0) {
						local180 = (int) ((this.aClass259_2.method5775() + 519L) / 520L);
						arg3 = false;
						if (local180 == 0) {
							local180++;
						}
						if (local71 == local180) {
							local180++;
						}
					}
					Static525.aByteArray97[2] = (byte) (local176 >> 8);
					Static525.aByteArray97[1] = (byte) arg2;
					Static525.aByteArray97[0] = (byte) (arg2 >> 8);
					Static525.aByteArray97[3] = (byte) local176;
					if (arg1 - local174 <= 512) {
						local180 = 0;
					}
					Static525.aByteArray97[5] = (byte) (local180 >> 8);
					Static525.aByteArray97[4] = (byte) (local180 >> 16);
					Static525.aByteArray97[6] = (byte) local180;
					Static525.aByteArray97[7] = (byte) this.anInt1850;
					this.aClass259_2.method5774((long) (local71 * 520));
					this.aClass259_2.method5772(0, 8, Static525.aByteArray97);
					local215 = arg1 - local174;
					if (local215 > 512) {
						local215 = 512;
					}
					this.aClass259_2.method5772(local174, local215, arg0);
					local71 = local180;
					local174 += local215;
					local176++;
				}
				return true;
			} catch (@Pc(430) IOException local430) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1850;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI)[B")
	public byte[] method1626(@OriginalArg(1) int arg0) {
		@Pc(8) Class259 local8 = this.aClass259_2;
		synchronized (this.aClass259_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass259_1.method5775()) {
					return null;
				}
				this.aClass259_1.method5774((long) (arg0 * 6));
				this.aClass259_1.method5769(Static525.aByteArray97, 6, 0);
				@Pc(78) int local78 = (Static525.aByteArray97[2] & 0xFF) + ((Static525.aByteArray97[1] & 0xFF) << 8) + ((Static525.aByteArray97[0] & 0xFF) << 16);
				@Pc(100) int local100 = (Static525.aByteArray97[5] & 0xFF) + ((Static525.aByteArray97[4] & 0xFF) << 8) + ((Static525.aByteArray97[3] & 0xFF) << 16);
				if (local78 < 0 || local78 > this.anInt1845) {
					return null;
				} else if (local100 > 0 && (long) local100 <= this.aClass259_2.method5775() / 520L) {
					@Pc(141) byte[] local141 = new byte[local78];
					@Pc(143) int local143 = 0;
					@Pc(145) int local145 = 0;
					while (local78 > local143) {
						if (local100 == 0) {
							return null;
						}
						this.aClass259_2.method5774((long) (local100 * 520));
						@Pc(168) int local168 = local78 - local143;
						if (local168 > 512) {
							local168 = 512;
						}
						this.aClass259_2.method5769(Static525.aByteArray97, local168 + 8, 0);
						@Pc(198) int local198 = (Static525.aByteArray97[1] & 0xFF) + ((Static525.aByteArray97[0] & 0xFF) << 8);
						@Pc(212) int local212 = (Static525.aByteArray97[3] & 0xFF) + ((Static525.aByteArray97[2] & 0xFF) << 8);
						@Pc(235) int local235 = ((Static525.aByteArray97[5] & 0xFF) << 8) + (Static525.aByteArray97[4] << 16 & 0xFF0000) + (Static525.aByteArray97[6] & 0xFF);
						@Pc(241) int local241 = Static525.aByteArray97[7] & 0xFF;
						if (local198 == arg0 && local145 == local212 && this.anInt1850 == local241) {
							if (local235 >= 0 && (long) local235 <= this.aClass259_2.method5775() / 520L) {
								for (@Pc(292) int local292 = 0; local292 < local168; local292++) {
									local141[local143++] = Static525.aByteArray97[local292 + 8];
								}
								local100 = local235;
								local145++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local141;
				} else {
					return null;
				}
			} catch (@Pc(320) IOException local320) {
				return null;
			}
		}
	}
}
