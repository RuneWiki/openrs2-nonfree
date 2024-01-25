import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class2_Sub13_Sub17 extends Class2_Sub13 {

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "[I")
	public static final int[] anIntArray644 = new int[256];

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "[I")
	private int[] anIntArray645;

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray39;

	@OriginalMember(owner = "client!tt", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray75;

	@OriginalMember(owner = "client!tt", name = "H", descriptor = "Lclient!dw;")
	public Class64 aClass64_2;

	@OriginalMember(owner = "client!tt", name = "L", descriptor = "[I")
	public int[] anIntArray646;

	@OriginalMember(owner = "client!tt", name = "E", descriptor = "Z")
	public boolean aBoolean607 = true;

	static {
		for (@Pc(143) int local143 = 0; local143 < 256; local143++) {
			@Pc(146) int local146 = local143;
			for (@Pc(148) int local148 = 0; local148 < 8; local148++) {
				if ((local146 & 0x1) == 1) {
					local146 = local146 >>> 1 ^ 0xEDB88320;
				} else {
					local146 >>>= 0x1;
				}
			}
			anIntArray644[local143] = local146;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!ps;)V")
	public void method7044(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5170();
			if (local13 == 0) {
				return;
			}
			this.method7053(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "(I)V")
	public void method7046() {
		if (this.anIntArray646 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray646.length; local17++) {
				this.anIntArray646[local17] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ps;I)Ljava/lang/String;")
	public String method7047(@OriginalArg(0) Class2_Sub29 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray645 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray645.length; local15++) {
				local10.append(this.aStringArray39[local15]);
				local10.append(this.aClass64_2.method1876(this.anIntArrayArray75[local15], this.method7048(local15), arg0.method5223(Static9.method379(this.anIntArray645[local15]).anInt7647)));
			}
		}
		local10.append(this.aStringArray39[this.aStringArray39.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)Lclient!rb;")
	public Class245 method7048(@OriginalArg(0) int arg0) {
		return this.anIntArray645 == null || arg0 < 0 || arg0 > this.anIntArray645.length ? null : Static9.method379(this.anIntArray645[arg0]);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([IZLclient!ps;)V")
	public void method7049(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (this.anIntArray645 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray645.length; local17++) {
			if (local17 >= arg0.length) {
				return;
			}
			@Pc(25) int local25 = this.method7048(local17).anInt7644;
			if (local25 > 0) {
				arg1.method5227(local25, (long) arg0[local17]);
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BII)I")
	public int method7050(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray645 == null || arg0 < 0 || this.anIntArray645.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray75[arg0] == null || arg1 < 0 || this.anIntArrayArray75[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray75[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ps;IB)V")
	private void method7053(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray39 = Static225.method3542('<', arg0.method5194());
			return;
		}
		@Pc(34) int local34;
		@Pc(44) int local44;
		if (arg1 == 2) {
			local34 = arg0.method5170();
			this.anIntArray646 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray646[local44] = arg0.method5229();
			}
		} else if (arg1 == 3) {
			local34 = arg0.method5170();
			this.anIntArray645 = new int[local34];
			this.anIntArrayArray75 = new int[local34][];
			for (local44 = 0; local44 < local34; local44++) {
				@Pc(50) int local50 = arg0.method5229();
				@Pc(54) Class245 local54 = Static9.method379(local50);
				if (local54 != null) {
					this.anIntArray645[local44] = local50;
					this.anIntArrayArray75[local44] = new int[local54.anInt7645];
					for (@Pc(70) int local70 = 0; local70 < local54.anInt7645; local70++) {
						this.anIntArrayArray75[local44][local70] = arg0.method5229();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean607 = false;
		}
	}

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "(I)Ljava/lang/String;")
	public String method7055() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray39 == null) {
			return "";
		}
		local10.append(this.aStringArray39[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray39.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray39[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)I")
	public int method7056() {
		return this.anIntArray645 == null ? 0 : this.anIntArray645.length;
	}
}
