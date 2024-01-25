import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class55 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "Lclient!cm;")
	private Class36 aClass36_3 = null;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
	private int anInt1524 = 65000;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Lclient!cm;")
	private Class36 aClass36_4 = null;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
	private final int anInt1521;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(ILclient!cm;Lclient!cm;I)V")
	public Class55(@OriginalArg(0) int arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) Class36 arg2, @OriginalArg(3) int arg3) {
		this.aClass36_3 = arg2;
		this.anInt1521 = arg0;
		this.anInt1524 = arg3;
		this.aClass36_4 = arg1;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBI[B)Z")
	public boolean method1162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class36 local6 = this.aClass36_4;
		synchronized (this.aClass36_4) {
			if (arg0 < 0 || this.anInt1524 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(36) boolean local36 = this.method1163(true, arg0, arg2, arg1);
			if (!local36) {
				local36 = this.method1163(false, arg0, arg2, arg1);
			}
			return local36;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI[BII)Z")
	private boolean method1163(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class36 local8 = this.aClass36_4;
		synchronized (this.aClass36_4) {
			try {
				@Pc(27) int local27;
				if (arg0) {
					if ((long) (arg3 * 6 + 6) > this.aClass36_3.method836()) {
						return false;
					}
					this.aClass36_3.method833((long) (arg3 * 6));
					this.aClass36_3.method839(6, Static336.aByteArray93, 0);
					local27 = (Static336.aByteArray93[5] & 0xFF) + ((Static336.aByteArray93[4] & 0xFF) << 8) + ((Static336.aByteArray93[3] & 0xFF) << 16);
					if (local27 <= 0 || this.aClass36_4.method836() / 520L < (long) local27) {
						return false;
					}
				} else {
					local27 = (int) ((this.aClass36_4.method836() + 519L) / 520L);
					if (local27 == 0) {
						local27 = 1;
					}
				}
				Static336.aByteArray93[2] = (byte) arg1;
				Static336.aByteArray93[3] = (byte) (local27 >> 16);
				Static336.aByteArray93[1] = (byte) (arg1 >> 8);
				Static336.aByteArray93[4] = (byte) (local27 >> 8);
				Static336.aByteArray93[0] = (byte) (arg1 >> 16);
				Static336.aByteArray93[5] = (byte) local27;
				this.aClass36_3.method833((long) (arg3 * 6));
				this.aClass36_3.method834(6, 0, Static336.aByteArray93);
				@Pc(164) int local164 = 0;
				@Pc(166) int local166 = 0;
				while (local164 < arg1) {
					@Pc(170) int local170 = 0;
					@Pc(205) int local205;
					if (arg0) {
						this.aClass36_4.method833((long) (local27 * 520));
						try {
							this.aClass36_4.method839(8, Static336.aByteArray93, 0);
						} catch (@Pc(189) EOFException local189) {
							return true;
						}
						local205 = ((Static336.aByteArray93[0] & 0xFF) << 8) + (Static336.aByteArray93[1] & 0xFF);
						local170 = (Static336.aByteArray93[6] & 0xFF) + ((Static336.aByteArray93[5] & 0xFF) << 8) + ((Static336.aByteArray93[4] & 0xFF) << 16);
						@Pc(241) int local241 = ((Static336.aByteArray93[2] & 0xFF) << 8) + (Static336.aByteArray93[3] & 0xFF);
						@Pc(247) int local247 = Static336.aByteArray93[7] & 0xFF;
						if (arg3 != local205 || local166 != local241 || local247 != this.anInt1521) {
							return false;
						}
						if (local170 < 0 || this.aClass36_4.method836() / 520L < (long) local170) {
							return false;
						}
					}
					if (local170 == 0) {
						local170 = (int) ((this.aClass36_4.method836() + 519L) / 520L);
						arg0 = false;
						if (local170 == 0) {
							local170++;
						}
						if (local170 == local27) {
							local170++;
						}
					}
					Static336.aByteArray93[1] = (byte) arg3;
					Static336.aByteArray93[3] = (byte) local166;
					if (arg1 - local164 <= 512) {
						local170 = 0;
					}
					Static336.aByteArray93[0] = (byte) (arg3 >> 8);
					Static336.aByteArray93[2] = (byte) (local166 >> 8);
					Static336.aByteArray93[5] = (byte) (local170 >> 8);
					Static336.aByteArray93[6] = (byte) local170;
					Static336.aByteArray93[7] = (byte) this.anInt1521;
					Static336.aByteArray93[4] = (byte) (local170 >> 16);
					this.aClass36_4.method833((long) (local27 * 520));
					this.aClass36_4.method834(8, 0, Static336.aByteArray93);
					local205 = arg1 - local164;
					if (local205 > 512) {
						local205 = 512;
					}
					this.aClass36_4.method834(local205, local164, arg2);
					local164 += local205;
					local166++;
					local27 = local170;
				}
				return true;
			} catch (@Pc(418) IOException local418) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[B")
	public byte[] method1164(@OriginalArg(0) int arg0) {
		@Pc(8) Class36 local8 = this.aClass36_4;
		synchronized (this.aClass36_4) {
			try {
				if (this.aClass36_3.method836() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass36_3.method833((long) (arg0 * 6));
				this.aClass36_3.method839(6, Static336.aByteArray93, 0);
				@Pc(66) int local66 = ((Static336.aByteArray93[1] & 0xFF) << 8) + (((Static336.aByteArray93[0] & 0xFF) << 16) + (Static336.aByteArray93[2] & 0xFF));
				@Pc(88) int local88 = (Static336.aByteArray93[5] & 0xFF) + ((Static336.aByteArray93[4] & 0xFF) << 8) + ((Static336.aByteArray93[3] & 0xFF) << 16);
				if (local66 < 0 || local66 > this.anInt1524) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aClass36_4.method836() / 520L) {
					@Pc(135) byte[] local135 = new byte[local66];
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					while (local137 < local66) {
						if (local88 == 0) {
							return null;
						}
						this.aClass36_4.method833((long) (local88 * 520));
						@Pc(165) int local165 = local66 - local137;
						if (local165 > 512) {
							local165 = 512;
						}
						this.aClass36_4.method839(local165 + 8, Static336.aByteArray93, 0);
						@Pc(193) int local193 = (Static336.aByteArray93[1] & 0xFF) + ((Static336.aByteArray93[0] & 0xFF) << 8);
						@Pc(207) int local207 = (Static336.aByteArray93[3] & 0xFF) + ((Static336.aByteArray93[2] & 0xFF) << 8);
						@Pc(229) int local229 = (Static336.aByteArray93[6] & 0xFF) + ((Static336.aByteArray93[4] & 0xFF) << 16) + ((Static336.aByteArray93[5] & 0xFF) << 8);
						@Pc(235) int local235 = Static336.aByteArray93[7] & 0xFF;
						if (local193 == arg0 && local207 == local139 && this.anInt1521 == local235) {
							if (local229 >= 0 && this.aClass36_4.method836() / 520L >= (long) local229) {
								local139++;
								for (@Pc(279) int local279 = 0; local279 < local165; local279++) {
									local135[local137++] = Static336.aByteArray93[local279 + 8];
								}
								local88 = local229;
								continue;
							}
							return null;
						}
						return null;
					}
					return local135;
				} else {
					return null;
				}
			} catch (@Pc(310) IOException local310) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1521;
	}
}
