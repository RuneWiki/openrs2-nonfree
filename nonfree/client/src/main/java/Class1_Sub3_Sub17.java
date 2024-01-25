import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ut", name = "K", descriptor = "Lclient!t;")
	public Class229 aClass229_2;

	@OriginalMember(owner = "client!ut", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray176;

	@OriginalMember(owner = "client!ut", name = "N", descriptor = "[I")
	public int[] anIntArray451;

	@OriginalMember(owner = "client!ut", name = "T", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray53;

	@OriginalMember(owner = "client!ut", name = "V", descriptor = "[I")
	private int[] anIntArray452;

	@OriginalMember(owner = "client!ut", name = "D", descriptor = "Z")
	public boolean aBoolean555 = true;

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "(I)I")
	public int method5198() {
		return this.anIntArray452 == null ? 0 : this.anIntArray452.length;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!dh;I[I)V")
	public void method5199(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray452 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray452.length; local11++) {
			if (local11 >= arg1.length) {
				return;
			}
			@Pc(19) int local19 = this.method5206(local11).anInt2351;
			if (local19 > 0) {
				arg0.method4481((long) arg1[local11], local19);
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "(I)V")
	public void method5200() {
		if (this.anIntArray451 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray451.length; local10++) {
				this.anIntArray451[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIB)I")
	public int method5201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray452 == null || arg1 < 0 || this.anIntArray452.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray176[arg1] == null || arg0 < 0 || this.anIntArrayArray176[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray176[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "(I)Ljava/lang/String;")
	public String method5202() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray53 == null) {
			return "";
		}
		local10.append(this.aStringArray53[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray53.length; local30++) {
			local10.append("...");
			local10.append(this.aStringArray53[local30]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!dh;)V")
	public void method5203(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4463();
			if (local13 == 0) {
				return;
			}
			this.method5208(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!dh;I)Ljava/lang/String;")
	public String method5205(@OriginalArg(0) Class1_Sub11 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray452 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray452.length; local15++) {
				local10.append(this.aStringArray53[local15]);
				local10.append(this.aClass229_2.method4851(this.anIntArrayArray176[local15], this.method5206(local15), arg0.method4495(Static295.method3883(this.anIntArray452[local15]).anInt2348)));
			}
		}
		local10.append(this.aStringArray53[this.aStringArray53.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)Lclient!go;")
	public Class97 method5206(@OriginalArg(1) int arg0) {
		return this.anIntArray452 == null || arg0 < 0 || this.anIntArray452.length < arg0 ? null : Static295.method3883(this.anIntArray452[arg0]);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZLclient!dh;)V")
	private void method5208(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if (arg0 == 1) {
			this.aStringArray53 = Static150.method2106(arg1.method4484(), '<');
			return;
		}
		@Pc(34) int local34;
		@Pc(44) int local44;
		if (arg0 == 2) {
			local34 = arg1.method4463();
			this.anIntArray451 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray451[local44] = arg1.method4485();
			}
		} else if (arg0 == 3) {
			local34 = arg1.method4463();
			this.anIntArrayArray176 = new int[local34][];
			this.anIntArray452 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				@Pc(50) int local50 = arg1.method4485();
				@Pc(54) Class97 local54 = Static295.method3883(local50);
				if (local54 != null) {
					this.anIntArray452[local44] = local50;
					this.anIntArrayArray176[local44] = new int[local54.anInt2352];
					for (@Pc(70) int local70 = 0; local70 < local54.anInt2352; local70++) {
						this.anIntArrayArray176[local44][local70] = arg1.method4485();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean555 = false;
		}
	}
}
