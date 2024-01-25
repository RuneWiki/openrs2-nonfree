import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class215 implements Interface2 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!tb;")
	private final Class219 aClass219_5 = new Class219(256);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "Lclient!ui;")
	private final Class230 aClass230_73;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!ui;")
	private final Class230 aClass230_74;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "[Lclient!ha;")
	private final Class98[] aClass98Array1;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!ui;Lclient!ui;Lclient!ui;)V")
	public Class215(@OriginalArg(0) Class230 arg0, @OriginalArg(1) Class230 arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_73 = arg2;
		this.aClass230_74 = arg1;
		@Pc(24) Class1_Sub33 local24 = new Class1_Sub33(arg0.method4985(0, 0));
		@Pc(28) int local28 = local24.method5177();
		this.aClass98Array1 = new Class98[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method5174() == 1) {
				this.aClass98Array1[local34] = new Class98();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass98Array1[local58] != null) {
				this.aClass98Array1[local58].aBoolean194 = local24.method5174() == 0;
			}
		}
		for (@Pc(90) int local90 = 0; local90 < local28; local90++) {
			if (this.aClass98Array1[local90] != null) {
				this.aClass98Array1[local90].aBoolean200 = local24.method5174() == 1;
			}
		}
		for (@Pc(120) int local120 = 0; local120 < local28; local120++) {
			if (this.aClass98Array1[local120] != null) {
				this.aClass98Array1[local120].aBoolean193 = local24.method5174() == 1;
			}
		}
		for (@Pc(150) int local150 = 0; local150 < local28; local150++) {
			if (this.aClass98Array1[local150] != null) {
				this.aClass98Array1[local150].aBoolean199 = local24.method5174() == 1;
			}
		}
		for (@Pc(180) int local180 = 0; local180 < local28; local180++) {
			if (this.aClass98Array1[local180] != null) {
				this.aClass98Array1[local180].aByte30 = local24.method5188();
			}
		}
		for (@Pc(201) int local201 = 0; local201 < local28; local201++) {
			if (this.aClass98Array1[local201] != null) {
				this.aClass98Array1[local201].aByte31 = local24.method5188();
			}
		}
		for (@Pc(222) int local222 = 0; local222 < local28; local222++) {
			if (this.aClass98Array1[local222] != null) {
				this.aClass98Array1[local222].aByte33 = local24.method5188();
			}
		}
		for (@Pc(247) int local247 = 0; local247 < local28; local247++) {
			if (this.aClass98Array1[local247] != null) {
				this.aClass98Array1[local247].aByte32 = local24.method5188();
			}
		}
		for (@Pc(272) int local272 = 0; local272 < local28; local272++) {
			if (this.aClass98Array1[local272] != null) {
				this.aClass98Array1[local272].aShort49 = (short) local24.method5177();
			}
		}
		for (@Pc(298) int local298 = 0; local298 < local28; local298++) {
			if (this.aClass98Array1[local298] != null) {
				this.aClass98Array1[local298].aByte29 = local24.method5188();
			}
		}
		for (@Pc(323) int local323 = 0; local323 < local28; local323++) {
			if (this.aClass98Array1[local323] != null) {
				this.aClass98Array1[local323].aByte27 = local24.method5188();
			}
		}
		for (@Pc(348) int local348 = 0; local348 < local28; local348++) {
			if (this.aClass98Array1[local348] != null) {
				this.aClass98Array1[local348].aBoolean201 = local24.method5174() == 1;
			}
		}
		for (@Pc(376) int local376 = 0; local376 < local28; local376++) {
			if (this.aClass98Array1[local376] != null) {
				this.aClass98Array1[local376].aBoolean196 = local24.method5174() == 1;
			}
		}
		for (@Pc(408) int local408 = 0; local408 < local28; local408++) {
			if (this.aClass98Array1[local408] != null) {
				this.aClass98Array1[local408].aByte28 = local24.method5188();
			}
		}
		for (@Pc(429) int local429 = 0; local429 < local28; local429++) {
			if (this.aClass98Array1[local429] != null) {
				this.aClass98Array1[local429].aBoolean197 = local24.method5174() == 1;
			}
		}
		for (@Pc(459) int local459 = 0; local459 < local28; local459++) {
			if (this.aClass98Array1[local459] != null) {
				this.aClass98Array1[local459].aBoolean198 = local24.method5174() == 1;
			}
		}
		for (@Pc(485) int local485 = 0; local485 < local28; local485++) {
			if (this.aClass98Array1[local485] != null) {
				this.aClass98Array1[local485].aBoolean195 = local24.method5174() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IFZIII)[F")
	@Override
	public float[] method4744(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method4746(arg0).method1918(this, this.aClass230_73, this.aClass98Array1[arg0].aBoolean196, arg3, arg2);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lclient!ha;")
	@Override
	public Class98 method4741(@OriginalArg(1) int arg0) {
		return this.aClass98Array1[arg0];
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZIIIFZ)[I")
	@Override
	public int[] method4742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) boolean arg4) {
		return this.method4746(arg1).method1919(arg2, this, arg0, this.aClass230_73, this.aClass98Array1[arg1].aBoolean196, arg4, (double) arg3);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZFIII)[I")
	@Override
	public int[] method4743(@OriginalArg(2) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method4746(arg3).method1915(this.aClass230_73, this, this.aClass98Array1[arg3].aBoolean196, (double) arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)Lclient!hb;")
	private Class1_Sub6_Sub6 method4746(@OriginalArg(1) int arg0) {
		@Pc(22) Class1_Sub6 local22 = this.aClass219_5.method4799((long) arg0);
		if (local22 != null) {
			return (Class1_Sub6_Sub6) local22;
		}
		@Pc(33) byte[] local33 = this.aClass230_74.method4961(arg0);
		if (local33 == null) {
			return null;
		} else {
			@Pc(45) Class1_Sub6_Sub6 local45 = new Class1_Sub6_Sub6(new Class1_Sub33(local33));
			this.aClass219_5.method4801((long) arg0, local45);
			return local45;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method4740(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub6_Sub6 local16 = this.method4746(arg0);
		return local16 != null && local16.method1917(this.aClass230_73, this);
	}
}
