import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class207 {

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Lclient!cv;")
	private Class64 aClass64_4 = null;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	private int anInt5430 = 65000;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!cv;")
	private Class64 aClass64_3 = null;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	private final int anInt5432;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(ILclient!cv;Lclient!cv;I)V")
	public Class207(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) int arg3) {
		this.anInt5432 = arg0;
		this.aClass64_4 = arg2;
		this.aClass64_3 = arg1;
		this.anInt5430 = arg3;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[B")
	public byte[] method4558(@OriginalArg(1) int arg0) {
		@Pc(13) Class64 local13 = this.aClass64_3;
		synchronized (this.aClass64_3) {
			try {
				if (this.aClass64_4.method1191() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass64_4.method1187((long) (arg0 * 6));
				this.aClass64_4.method1182(0, 6, Static47.aByteArray8);
				@Pc(70) int local70 = ((Static47.aByteArray8[1] & 0xFF) << 8) + ((Static47.aByteArray8[0] & 0xFF) << 16) + (Static47.aByteArray8[2] & 0xFF);
				@Pc(92) int local92 = ((Static47.aByteArray8[4] & 0xFF) << 8) + (Static47.aByteArray8[3] << 16 & 0xFF0000) + (Static47.aByteArray8[5] & 0xFF);
				if (local70 < 0 || local70 > this.anInt5430) {
					return null;
				} else if (local92 > 0 && (long) local92 <= this.aClass64_3.method1191() / 520L) {
					@Pc(131) byte[] local131 = new byte[local70];
					@Pc(133) int local133 = 0;
					@Pc(135) int local135 = 0;
					label55: while (local70 > local133) {
						if (local92 == 0) {
							return null;
						}
						this.aClass64_3.method1187((long) (local92 * 520));
						@Pc(160) int local160 = local70 - local133;
						if (local160 > 512) {
							local160 = 512;
						}
						this.aClass64_3.method1182(0, local160 + 8, Static47.aByteArray8);
						@Pc(188) int local188 = (Static47.aByteArray8[1] & 0xFF) + ((Static47.aByteArray8[0] & 0xFF) << 8);
						@Pc(203) int local203 = ((Static47.aByteArray8[2] & 0xFF) << 8) + (Static47.aByteArray8[3] & 0xFF);
						@Pc(225) int local225 = (Static47.aByteArray8[6] & 0xFF) + ((Static47.aByteArray8[5] & 0xFF) << 8) + ((Static47.aByteArray8[4] & 0xFF) << 16);
						@Pc(231) int local231 = Static47.aByteArray8[7] & 0xFF;
						if (arg0 == local188 && local135 == local203 && local231 == this.anInt5432) {
							if (local225 >= 0 && this.aClass64_3.method1191() / 520L >= (long) local225) {
								local135++;
								local92 = local225;
								@Pc(278) int local278 = 0;
								while (true) {
									if (local278 >= local160) {
										continue label55;
									}
									local131[local133++] = Static47.aByteArray8[local278 + 8];
									local278++;
								}
							}
							return null;
						}
						return null;
					}
					return local131;
				} else {
					return null;
				}
			} catch (@Pc(303) IOException local303) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBZI[B)Z")
	private boolean method4559(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class64 local8 = this.aClass64_3;
		synchronized (this.aClass64_3) {
			try {
				@Pc(29) int local29;
				if (arg1) {
					if ((long) (arg0 * 6 + 6) > this.aClass64_4.method1191()) {
						return false;
					}
					this.aClass64_4.method1187((long) (arg0 * 6));
					this.aClass64_4.method1182(0, 6, Static47.aByteArray8);
					local29 = ((Static47.aByteArray8[3] & 0xFF) << 16) + ((Static47.aByteArray8[4] & 0xFF) << 8) + (Static47.aByteArray8[5] & 0xFF);
					if (local29 <= 0 || (long) local29 > this.aClass64_3.method1191() / 520L) {
						return false;
					}
				} else {
					local29 = (int) ((this.aClass64_3.method1191() + 519L) / 520L);
					if (local29 == 0) {
						local29 = 1;
					}
				}
				Static47.aByteArray8[3] = (byte) (local29 >> 16);
				Static47.aByteArray8[5] = (byte) local29;
				Static47.aByteArray8[2] = (byte) arg2;
				Static47.aByteArray8[1] = (byte) (arg2 >> 8);
				Static47.aByteArray8[4] = (byte) (local29 >> 8);
				Static47.aByteArray8[0] = (byte) (arg2 >> 16);
				this.aClass64_4.method1187((long) (arg0 * 6));
				this.aClass64_4.method1188(Static47.aByteArray8, 0, 6);
				@Pc(170) int local170 = 0;
				@Pc(172) int local172 = 0;
				while (arg2 > local170) {
					@Pc(176) int local176 = 0;
					@Pc(212) int local212;
					if (arg1) {
						this.aClass64_3.method1187((long) (local29 * 520));
						try {
							this.aClass64_3.method1182(0, 8, Static47.aByteArray8);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						local212 = ((Static47.aByteArray8[0] & 0xFF) << 8) + (Static47.aByteArray8[1] & 0xFF);
						@Pc(227) int local227 = ((Static47.aByteArray8[2] & 0xFF) << 8) + (Static47.aByteArray8[3] & 0xFF);
						local176 = ((Static47.aByteArray8[5] & 0xFF) << 8) + (Static47.aByteArray8[4] << 16 & 0xFF0000) + (Static47.aByteArray8[6] & 0xFF);
						@Pc(255) int local255 = Static47.aByteArray8[7] & 0xFF;
						if (local212 != arg0 || local227 != local172 || local255 != this.anInt5432) {
							return false;
						}
						if (local176 < 0 || this.aClass64_3.method1191() / 520L < (long) local176) {
							return false;
						}
					}
					if (local176 == 0) {
						local176 = (int) ((this.aClass64_3.method1191() + 519L) / 520L);
						arg1 = false;
						if (local176 == 0) {
							local176++;
						}
						if (local176 == local29) {
							local176++;
						}
					}
					Static47.aByteArray8[3] = (byte) local172;
					Static47.aByteArray8[2] = (byte) (local172 >> 8);
					Static47.aByteArray8[1] = (byte) arg0;
					Static47.aByteArray8[0] = (byte) (arg0 >> 8);
					if (arg2 - local170 <= 512) {
						local176 = 0;
					}
					Static47.aByteArray8[7] = (byte) this.anInt5432;
					Static47.aByteArray8[4] = (byte) (local176 >> 16);
					Static47.aByteArray8[5] = (byte) (local176 >> 8);
					Static47.aByteArray8[6] = (byte) local176;
					this.aClass64_3.method1187((long) (local29 * 520));
					this.aClass64_3.method1188(Static47.aByteArray8, 0, 8);
					local212 = arg2 - local170;
					if (local212 > 512) {
						local212 = 512;
					}
					this.aClass64_3.method1188(arg3, local170, local212);
					local29 = local176;
					local172++;
					local170 += local212;
				}
				return true;
			} catch (@Pc(436) IOException local436) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[BII)Z")
	public boolean method4560(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class64 local6 = this.aClass64_3;
		synchronized (this.aClass64_3) {
			if (arg0 < 0 || arg0 > this.anInt5430) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method4559(arg2, true, arg0, arg1);
			if (!local33) {
				local33 = this.method4559(arg2, false, arg0, arg1);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5432;
	}
}
