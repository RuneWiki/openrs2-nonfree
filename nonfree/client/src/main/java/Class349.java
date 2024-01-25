import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class349 {

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
	private int anInt9520 = 65000;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "Lclient!kr;")
	private Class204 aClass204_4 = null;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "Lclient!kr;")
	private Class204 aClass204_5 = null;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
	private final int anInt9519;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(ILclient!kr;Lclient!kr;I)V")
	public Class349(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(3) int arg3) {
		this.anInt9520 = arg3;
		this.aClass204_5 = arg1;
		this.aClass204_4 = arg2;
		this.anInt9519 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZB[BII)Z")
	private boolean method8076(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class204 local8 = this.aClass204_5;
		synchronized (this.aClass204_5) {
			try {
				@Pc(73) int local73;
				if (arg0) {
					if (this.aClass204_4.method4775() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass204_4.method4773((long) (arg2 * 6));
					this.aClass204_4.method4779(0, 6, Static419.aByteArray78);
					local73 = (Static419.aByteArray78[5] & 0xFF) + ((Static419.aByteArray78[4] & 0xFF) << 8) + ((Static419.aByteArray78[3] & 0xFF) << 16);
					if (local73 <= 0 || this.aClass204_5.method4775() / 520L < (long) local73) {
						return false;
					}
				} else {
					local73 = (int) ((this.aClass204_5.method4775() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				Static419.aByteArray78[5] = (byte) local73;
				Static419.aByteArray78[2] = (byte) arg3;
				Static419.aByteArray78[4] = (byte) (local73 >> 8);
				Static419.aByteArray78[0] = (byte) (arg3 >> 16);
				Static419.aByteArray78[1] = (byte) (arg3 >> 8);
				Static419.aByteArray78[3] = (byte) (local73 >> 16);
				this.aClass204_4.method4773((long) (arg2 * 6));
				this.aClass204_4.method4771(0, Static419.aByteArray78, 6);
				@Pc(165) int local165 = 0;
				@Pc(176) int local176 = 0;
				while (local165 < arg3) {
					@Pc(180) int local180 = 0;
					@Pc(215) int local215;
					if (arg0) {
						this.aClass204_5.method4773((long) (local73 * 520));
						try {
							this.aClass204_5.method4779(0, 8, Static419.aByteArray78);
						} catch (@Pc(199) EOFException local199) {
							return true;
						}
						local215 = ((Static419.aByteArray78[0] & 0xFF) << 8) + (Static419.aByteArray78[1] & 0xFF);
						@Pc(229) int local229 = ((Static419.aByteArray78[2] & 0xFF) << 8) + (Static419.aByteArray78[3] & 0xFF);
						local180 = ((Static419.aByteArray78[5] & 0xFF) << 8) + ((Static419.aByteArray78[4] & 0xFF) << 16) + (Static419.aByteArray78[6] & 0xFF);
						@Pc(258) int local258 = Static419.aByteArray78[7] & 0xFF;
						if (local215 != arg2 || local176 != local229 || local258 != this.anInt9519) {
							return false;
						}
						if (local180 < 0 || this.aClass204_5.method4775() / 520L < (long) local180) {
							return false;
						}
					}
					if (local180 == 0) {
						arg0 = false;
						local180 = (int) ((this.aClass204_5.method4775() + 519L) / 520L);
						if (local180 == 0) {
							local180++;
						}
						if (local180 == local73) {
							local180++;
						}
					}
					if (arg3 - local165 <= 512) {
						local180 = 0;
					}
					Static419.aByteArray78[2] = (byte) (local176 >> 8);
					Static419.aByteArray78[3] = (byte) local176;
					Static419.aByteArray78[1] = (byte) arg2;
					Static419.aByteArray78[0] = (byte) (arg2 >> 8);
					Static419.aByteArray78[6] = (byte) local180;
					Static419.aByteArray78[5] = (byte) (local180 >> 8);
					Static419.aByteArray78[4] = (byte) (local180 >> 16);
					Static419.aByteArray78[7] = (byte) this.anInt9519;
					this.aClass204_5.method4773((long) (local73 * 520));
					this.aClass204_5.method4771(0, Static419.aByteArray78, 8);
					local215 = arg3 - local165;
					if (local215 > 512) {
						local215 = 512;
					}
					this.aClass204_5.method4771(local165, arg1, local215);
					local176++;
					local73 = local180;
					local165 += local215;
				}
				return true;
			} catch (@Pc(437) IOException local437) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt9519;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[BII)Z")
	public boolean method8077(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class204 local6 = this.aClass204_5;
		synchronized (this.aClass204_5) {
			if (arg1 < 0 || arg1 > this.anInt9520) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method8076(true, arg0, arg2, arg1);
			if (!local33) {
				local33 = this.method8076(false, arg0, arg2, arg1);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)[B")
	public byte[] method8079(@OriginalArg(1) int arg0) {
		@Pc(8) Class204 local8 = this.aClass204_5;
		synchronized (this.aClass204_5) {
			try {
				if (this.aClass204_4.method4775() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass204_4.method4773((long) (arg0 * 6));
				this.aClass204_4.method4779(0, 6, Static419.aByteArray78);
				@Pc(71) int local71 = (Static419.aByteArray78[2] & 0xFF) + ((Static419.aByteArray78[1] & 0xFF) << 8) + ((Static419.aByteArray78[0] & 0xFF) << 16);
				@Pc(93) int local93 = ((Static419.aByteArray78[4] & 0xFF) << 8) + ((Static419.aByteArray78[3] & 0xFF) << 16) + (Static419.aByteArray78[5] & 0xFF);
				if (local71 < 0 || local71 > this.anInt9520) {
					return null;
				} else if (local93 > 0 && (long) local93 <= this.aClass204_5.method4775() / 520L) {
					@Pc(141) byte[] local141 = new byte[local71];
					@Pc(143) int local143 = 0;
					@Pc(145) int local145 = 0;
					while (local71 > local143) {
						if (local93 == 0) {
							return null;
						}
						this.aClass204_5.method4773((long) (local93 * 520));
						@Pc(169) int local169 = local71 - local143;
						if (local169 > 512) {
							local169 = 512;
						}
						this.aClass204_5.method4779(0, local169 + 8, Static419.aByteArray78);
						@Pc(199) int local199 = ((Static419.aByteArray78[0] & 0xFF) << 8) + (Static419.aByteArray78[1] & 0xFF);
						@Pc(213) int local213 = ((Static419.aByteArray78[2] & 0xFF) << 8) + (Static419.aByteArray78[3] & 0xFF);
						@Pc(236) int local236 = (Static419.aByteArray78[6] & 0xFF) + ((Static419.aByteArray78[4] & 0xFF) << 16) + ((Static419.aByteArray78[5] & 0xFF) << 8);
						@Pc(242) int local242 = Static419.aByteArray78[7] & 0xFF;
						if (local199 == arg0 && local213 == local145 && this.anInt9519 == local242) {
							if (local236 >= 0 && (long) local236 <= this.aClass204_5.method4775() / 520L) {
								local93 = local236;
								for (@Pc(292) int local292 = 0; local292 < local169; local292++) {
									local141[local143++] = Static419.aByteArray78[local292 + 8];
								}
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
			} catch (@Pc(318) IOException local318) {
				return null;
			}
		}
	}
}
