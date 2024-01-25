import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class180 implements Interface5 {

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "Lclient!in;")
	private final Class157 aClass157_3 = new Class157(256);

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "Lclient!ga;")
	private final Class111 aClass111_54;

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "Lclient!ga;")
	private final Class111 aClass111_55;

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
	private final int anInt4745;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "[Lclient!cea;")
	private final Class45[] aClass45Array1;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!ga;Lclient!ga;Lclient!ga;)V")
	public Class180(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_54 = arg2;
		this.aClass111_55 = arg1;
		@Pc(24) Class1_Sub20 local24 = new Class1_Sub20(arg0.method2441(0, 0));
		this.anInt4745 = local24.method4426();
		this.aClass45Array1 = new Class45[this.anInt4745];
		for (@Pc(36) int local36 = 0; local36 < this.anInt4745; local36++) {
			if (local24.method4393() == 1) {
				this.aClass45Array1[local36] = new Class45();
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anInt4745; local59++) {
			if (this.aClass45Array1[local59] != null) {
				this.aClass45Array1[local59].aBoolean118 = local24.method4393() == 0;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt4745; local92++) {
			if (this.aClass45Array1[local92] != null) {
				this.aClass45Array1[local92].aBoolean119 = local24.method4393() == 1;
			}
		}
		for (@Pc(119) int local119 = 0; local119 < this.anInt4745; local119++) {
			if (this.aClass45Array1[local119] != null) {
				this.aClass45Array1[local119].aBoolean124 = local24.method4393() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < this.anInt4745; local152++) {
			if (this.aClass45Array1[local152] != null) {
				this.aClass45Array1[local152].aBoolean123 = local24.method4393() == 1;
			}
		}
		for (@Pc(183) int local183 = 0; local183 < this.anInt4745; local183++) {
			if (this.aClass45Array1[local183] != null) {
				this.aClass45Array1[local183].aByte28 = local24.method4432();
			}
		}
		for (@Pc(205) int local205 = 0; local205 < this.anInt4745; local205++) {
			if (this.aClass45Array1[local205] != null) {
				this.aClass45Array1[local205].aByte22 = local24.method4432();
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.anInt4745; local231++) {
			if (this.aClass45Array1[local231] != null) {
				this.aClass45Array1[local231].aByte25 = local24.method4432();
			}
		}
		for (@Pc(253) int local253 = 0; local253 < this.anInt4745; local253++) {
			if (this.aClass45Array1[local253] != null) {
				this.aClass45Array1[local253].aByte23 = local24.method4432();
			}
		}
		for (@Pc(275) int local275 = 0; local275 < this.anInt4745; local275++) {
			if (this.aClass45Array1[local275] != null) {
				this.aClass45Array1[local275].aShort19 = (short) local24.method4426();
			}
		}
		for (@Pc(298) int local298 = 0; local298 < this.anInt4745; local298++) {
			if (this.aClass45Array1[local298] != null) {
				this.aClass45Array1[local298].aByte26 = local24.method4432();
			}
		}
		for (@Pc(324) int local324 = 0; local324 < this.anInt4745; local324++) {
			if (this.aClass45Array1[local324] != null) {
				this.aClass45Array1[local324].aByte24 = local24.method4432();
			}
		}
		for (@Pc(346) int local346 = 0; local346 < this.anInt4745; local346++) {
			if (this.aClass45Array1[local346] != null) {
				this.aClass45Array1[local346].aBoolean117 = local24.method4393() == 1;
			}
		}
		for (@Pc(379) int local379 = 0; local379 < this.anInt4745; local379++) {
			if (this.aClass45Array1[local379] != null) {
				this.aClass45Array1[local379].aBoolean116 = local24.method4393() == 1;
			}
		}
		for (@Pc(406) int local406 = 0; local406 < this.anInt4745; local406++) {
			if (this.aClass45Array1[local406] != null) {
				this.aClass45Array1[local406].aByte27 = local24.method4432();
			}
		}
		for (@Pc(428) int local428 = 0; local428 < this.anInt4745; local428++) {
			if (this.aClass45Array1[local428] != null) {
				this.aClass45Array1[local428].aBoolean122 = local24.method4393() == 1;
			}
		}
		for (@Pc(461) int local461 = 0; local461 < this.anInt4745; local461++) {
			if (this.aClass45Array1[local461] != null) {
				this.aClass45Array1[local461].aBoolean125 = local24.method4393() == 1;
			}
		}
		for (@Pc(488) int local488 = 0; local488 < this.anInt4745; local488++) {
			if (this.aClass45Array1[local488] != null) {
				this.aClass45Array1[local488].aBoolean120 = local24.method4393() == 1;
			}
		}
		for (@Pc(515) int local515 = 0; local515 < this.anInt4745; local515++) {
			if (this.aClass45Array1[local515] != null) {
				this.aClass45Array1[local515].anInt1535 = local24.method4393();
			}
		}
		for (@Pc(541) int local541 = 0; local541 < this.anInt4745; local541++) {
			if (this.aClass45Array1[local541] != null) {
				this.aClass45Array1[local541].anInt1536 = local24.method4371();
			}
		}
		for (@Pc(567) int local567 = 0; local567 < this.anInt4745; local567++) {
			if (this.aClass45Array1[local567] != null) {
				this.aClass45Array1[local567].aBoolean121 = local24.method4393() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method4045(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub8 local8 = this.method4050(arg0);
		return local8 != null && local8.method1890(this, this.aClass111_54);
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(ZI)Lclient!dv;")
	private Class1_Sub3_Sub8 method4050(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3 local10 = this.aClass157_3.method3684((long) arg0);
		if (local10 != null) {
			return (Class1_Sub3_Sub8) local10;
		}
		@Pc(21) byte[] local21 = this.aClass111_55.method2449(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(38) Class1_Sub3_Sub8 local38 = new Class1_Sub3_Sub8(new Class1_Sub20(local21));
			this.aClass157_3.method3687((long) arg0, local38);
			return local38;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZIFII)[F")
	@Override
	public float[] method4044(@OriginalArg(0) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method4050(arg2).method1894(arg0, this.aClass45Array1[arg2].aBoolean116, arg3, this, this.aClass111_54);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)I")
	@Override
	public int method4046() {
		return this.anInt4745;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IBIZFI)[I")
	@Override
	public int[] method4048(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4) {
		return this.method4050(arg0).method1892(arg2, arg4, this.aClass45Array1[arg0].aBoolean116, arg1, this, this.aClass111_54, (double) arg3);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)Lclient!cea;")
	@Override
	public Class45 method4043(@OriginalArg(1) int arg0) {
		return this.aClass45Array1[arg0];
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZIZIFI)[I")
	@Override
	public int[] method4047(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method4050(arg3).method1895(arg0, arg1, this.aClass111_54, this.aClass45Array1[arg3].aBoolean116, this, (double) arg2);
	}
}
