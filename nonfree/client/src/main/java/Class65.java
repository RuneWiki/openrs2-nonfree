import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class65 {

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "Lclient!bo;")
	private Class26 aClass26_2 = null;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
	private int anInt2067 = 65000;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Lclient!bo;")
	private Class26 aClass26_3 = null;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
	private final int anInt2071;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(ILclient!bo;Lclient!bo;I)V")
	public Class65(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3) {
		this.anInt2071 = arg0;
		this.aClass26_3 = arg1;
		this.aClass26_2 = arg2;
		this.anInt2067 = arg3;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIZZ[B)Z")
	private boolean method1784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class26 local8 = this.aClass26_3;
		synchronized (this.aClass26_3) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass26_2.method663() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass26_2.method669((long) (arg1 * 6));
					this.aClass26_2.method667(0, Static174.aByteArray56, 6);
					local22 = (Static174.aByteArray56[5] & 0xFF) + ((Static174.aByteArray56[4] & 0xFF) << 8) + ((Static174.aByteArray56[3] & 0xFF) << 16);
					if (local22 <= 0 || this.aClass26_3.method663() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass26_3.method663() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static174.aByteArray56[3] = (byte) (local22 >> 16);
				Static174.aByteArray56[1] = (byte) (arg0 >> 8);
				Static174.aByteArray56[0] = (byte) (arg0 >> 16);
				Static174.aByteArray56[4] = (byte) (local22 >> 8);
				Static174.aByteArray56[2] = (byte) arg0;
				Static174.aByteArray56[5] = (byte) local22;
				this.aClass26_2.method669((long) (arg1 * 6));
				this.aClass26_2.method668(0, Static174.aByteArray56, 6);
				@Pc(179) int local179 = 0;
				@Pc(181) int local181 = 0;
				while (local179 < arg0) {
					@Pc(185) int local185 = 0;
					@Pc(220) int local220;
					if (arg2) {
						this.aClass26_3.method669((long) (local22 * 520));
						try {
							this.aClass26_3.method667(0, Static174.aByteArray56, 8);
						} catch (@Pc(204) EOFException local204) {
							return true;
						}
						local220 = (Static174.aByteArray56[1] & 0xFF) + ((Static174.aByteArray56[0] & 0xFF) << 8);
						@Pc(235) int local235 = ((Static174.aByteArray56[2] & 0xFF) << 8) + (Static174.aByteArray56[3] & 0xFF);
						local185 = ((Static174.aByteArray56[4] & 0xFF) << 16) - (-((Static174.aByteArray56[5] & 0xFF) << 8) - (Static174.aByteArray56[6] & 0xFF));
						@Pc(265) int local265 = Static174.aByteArray56[7] & 0xFF;
						if (local220 != arg1 || local235 != local181 || this.anInt2071 != local265) {
							return false;
						}
						if (local185 < 0 || (long) local185 > this.aClass26_3.method663() / 520L) {
							return false;
						}
					}
					if (local185 == 0) {
						local185 = (int) ((this.aClass26_3.method663() + 519L) / 520L);
						arg2 = false;
						if (local185 == 0) {
							local185++;
						}
						if (local185 == local22) {
							local185++;
						}
					}
					Static174.aByteArray56[1] = (byte) arg1;
					Static174.aByteArray56[3] = (byte) local181;
					Static174.aByteArray56[2] = (byte) (local181 >> 8);
					if (arg0 - local179 <= 512) {
						local185 = 0;
					}
					Static174.aByteArray56[0] = (byte) (arg1 >> 8);
					Static174.aByteArray56[4] = (byte) (local185 >> 16);
					Static174.aByteArray56[7] = (byte) this.anInt2071;
					Static174.aByteArray56[6] = (byte) local185;
					Static174.aByteArray56[5] = (byte) (local185 >> 8);
					this.aClass26_3.method669((long) (local22 * 520));
					this.aClass26_3.method668(0, Static174.aByteArray56, 8);
					local220 = arg0 - local179;
					if (local220 > 512) {
						local220 = 512;
					}
					this.aClass26_3.method668(local179, arg3, local220);
					local22 = local185;
					local181++;
					local179 += local220;
				}
				return true;
			} catch (@Pc(442) IOException local442) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BII)Z")
	public boolean method1785(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class26 local6 = this.aClass26_3;
		synchronized (this.aClass26_3) {
			if (arg0 < 0 || this.anInt2067 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method1784(arg0, arg2, true, arg1);
			if (!local29) {
				local29 = this.method1784(arg0, arg2, false, arg1);
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)[B")
	public byte[] method1787(@OriginalArg(1) int arg0) {
		@Pc(8) Class26 local8 = this.aClass26_3;
		synchronized (this.aClass26_3) {
			try {
				if (this.aClass26_2.method663() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass26_2.method669((long) (arg0 * 6));
				this.aClass26_2.method667(0, Static174.aByteArray56, 6);
				@Pc(69) int local69 = (Static174.aByteArray56[2] & 0xFF) + ((Static174.aByteArray56[1] & 0xFF) << 8) + ((Static174.aByteArray56[0] & 0xFF) << 16);
				@Pc(91) int local91 = (Static174.aByteArray56[5] & 0xFF) + ((Static174.aByteArray56[4] & 0xFF) << 8) + ((Static174.aByteArray56[3] & 0xFF) << 16);
				if (local69 < 0 || this.anInt2067 < local69) {
					return null;
				} else if (local91 > 0 && (long) local91 <= this.aClass26_3.method663() / 520L) {
					@Pc(138) byte[] local138 = new byte[local69];
					@Pc(140) int local140 = 0;
					@Pc(142) int local142 = 0;
					while (local140 < local69) {
						if (local91 == 0) {
							return null;
						}
						this.aClass26_3.method669((long) (local91 * 520));
						@Pc(165) int local165 = local69 - local140;
						if (local165 > 512) {
							local165 = 512;
						}
						this.aClass26_3.method667(0, Static174.aByteArray56, local165 + 8);
						@Pc(196) int local196 = ((Static174.aByteArray56[0] & 0xFF) << 8) + (Static174.aByteArray56[1] & 0xFF);
						@Pc(211) int local211 = ((Static174.aByteArray56[2] & 0xFF) << 8) + (Static174.aByteArray56[3] & 0xFF);
						@Pc(234) int local234 = ((Static174.aByteArray56[5] & 0xFF) << 8) + ((Static174.aByteArray56[4] & 0xFF) << 16) + (Static174.aByteArray56[6] & 0xFF);
						@Pc(240) int local240 = Static174.aByteArray56[7] & 0xFF;
						if (local196 == arg0 && local142 == local211 && this.anInt2071 == local240) {
							if (local234 >= 0 && this.aClass26_3.method663() / 520L >= (long) local234) {
								local91 = local234;
								for (@Pc(289) int local289 = 0; local289 < local165; local289++) {
									local138[local140++] = Static174.aByteArray56[local289 + 8];
								}
								local142++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local138;
				} else {
					return null;
				}
			} catch (@Pc(323) IOException local323) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2071;
	}
}
