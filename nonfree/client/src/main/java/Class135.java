import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class135 implements Interface2 {

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "Lclient!jl;")
	private final Class159 aClass159_2 = new Class159(256);

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "Lclient!oh;")
	private final Class237 aClass237_59;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Lclient!oh;")
	private final Class237 aClass237_60;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
	private final int anInt4940;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "[Lclient!nba;")
	private final Class218[] aClass218Array1;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!oh;Lclient!oh;Lclient!oh;)V")
	public Class135(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_59 = arg1;
		this.aClass237_60 = arg2;
		@Pc(24) Class8_Sub8 local24 = new Class8_Sub8(arg0.method6314(0, 0));
		this.anInt4940 = local24.method8578();
		this.aClass218Array1 = new Class218[this.anInt4940];
		for (@Pc(36) int local36 = 0; local36 < this.anInt4940; local36++) {
			if (local24.method8525() == 1) {
				this.aClass218Array1[local36] = new Class218();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt4940; local61++) {
			if (this.aClass218Array1[local61] != null) {
				this.aClass218Array1[local61].aBoolean471 = local24.method8525() == 0;
			}
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt4940; local90++) {
			if (this.aClass218Array1[local90] != null) {
				this.aClass218Array1[local90].aBoolean476 = local24.method8525() == 1;
			}
		}
		for (@Pc(119) int local119 = 0; local119 < this.anInt4940; local119++) {
			if (this.aClass218Array1[local119] != null) {
				this.aClass218Array1[local119].aBoolean475 = local24.method8525() == 1;
			}
		}
		for (@Pc(148) int local148 = 0; local148 < this.anInt4940; local148++) {
			if (this.aClass218Array1[local148] != null) {
				this.aClass218Array1[local148].aByte68 = local24.method8550();
			}
		}
		for (@Pc(174) int local174 = 0; local174 < this.anInt4940; local174++) {
			if (this.aClass218Array1[local174] != null) {
				this.aClass218Array1[local174].aByte63 = local24.method8550();
			}
		}
		for (@Pc(200) int local200 = 0; local200 < this.anInt4940; local200++) {
			if (this.aClass218Array1[local200] != null) {
				this.aClass218Array1[local200].aByte66 = local24.method8550();
			}
		}
		for (@Pc(222) int local222 = 0; local222 < this.anInt4940; local222++) {
			if (this.aClass218Array1[local222] != null) {
				this.aClass218Array1[local222].aByte62 = local24.method8550();
			}
		}
		for (@Pc(244) int local244 = 0; local244 < this.anInt4940; local244++) {
			if (this.aClass218Array1[local244] != null) {
				this.aClass218Array1[local244].aShort73 = (short) local24.method8578();
			}
		}
		for (@Pc(267) int local267 = 0; local267 < this.anInt4940; local267++) {
			if (this.aClass218Array1[local267] != null) {
				this.aClass218Array1[local267].aByte67 = local24.method8550();
			}
		}
		for (@Pc(293) int local293 = 0; local293 < this.anInt4940; local293++) {
			if (this.aClass218Array1[local293] != null) {
				this.aClass218Array1[local293].aByte64 = local24.method8550();
			}
		}
		for (@Pc(315) int local315 = 0; local315 < this.anInt4940; local315++) {
			if (this.aClass218Array1[local315] != null) {
				this.aClass218Array1[local315].aBoolean474 = local24.method8525() == 1;
			}
		}
		for (@Pc(344) int local344 = 0; local344 < this.anInt4940; local344++) {
			if (this.aClass218Array1[local344] != null) {
				this.aClass218Array1[local344].aBoolean473 = local24.method8525() == 1;
			}
		}
		for (@Pc(375) int local375 = 0; local375 < this.anInt4940; local375++) {
			if (this.aClass218Array1[local375] != null) {
				this.aClass218Array1[local375].aByte65 = local24.method8550();
			}
		}
		for (@Pc(401) int local401 = 0; local401 < this.anInt4940; local401++) {
			if (this.aClass218Array1[local401] != null) {
				this.aClass218Array1[local401].aBoolean478 = local24.method8525() == 1;
			}
		}
		for (@Pc(428) int local428 = 0; local428 < this.anInt4940; local428++) {
			if (this.aClass218Array1[local428] != null) {
				this.aClass218Array1[local428].aBoolean472 = local24.method8525() == 1;
			}
		}
		for (@Pc(457) int local457 = 0; local457 < this.anInt4940; local457++) {
			if (this.aClass218Array1[local457] != null) {
				this.aClass218Array1[local457].aBoolean477 = local24.method8525() == 1;
			}
		}
		for (@Pc(484) int local484 = 0; local484 < this.anInt4940; local484++) {
			if (this.aClass218Array1[local484] != null) {
				this.aClass218Array1[local484].anInt6843 = local24.method8525();
			}
		}
		for (@Pc(506) int local506 = 0; local506 < this.anInt4940; local506++) {
			if (this.aClass218Array1[local506] != null) {
				this.aClass218Array1[local506].anInt6845 = local24.method8540();
			}
		}
		for (@Pc(528) int local528 = 0; local528 < this.anInt4940; local528++) {
			if (this.aClass218Array1[local528] != null) {
				this.aClass218Array1[local528].anInt6842 = local24.method8525();
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4025(@OriginalArg(1) int arg0) {
		@Pc(14) Class8_Sub5_Sub14 local14 = this.method4030(arg0);
		return local14 != null && local14.method6275(this, this.aClass237_60);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZIIIBF)[F")
	@Override
	public float[] method4029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3) {
		return this.method4030(arg0).method6273(this, this.aClass218Array1[arg0].aBoolean473, this.aClass237_60, arg1, arg2);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZIIIFI)[I")
	@Override
	public int[] method4026(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4) {
		return this.method4030(arg2).method6281((double) arg3, arg4, arg0, arg1, this, this.aClass218Array1[arg2].aBoolean473, this.aClass237_60);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)Lclient!nba;")
	@Override
	public Class218 method4027(@OriginalArg(0) int arg0) {
		return this.aClass218Array1[arg0];
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)I")
	@Override
	public int method4024() {
		return this.anInt4940;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(FIIZII)[I")
	@Override
	public int[] method4028(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return this.method4030(arg2).method6276(arg1, arg3, (double) arg0, this.aClass237_60, this, this.aClass218Array1[arg2].aBoolean473);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(IZ)Lclient!og;")
	private Class8_Sub5_Sub14 method4030(@OriginalArg(0) int arg0) {
		@Pc(10) Class8_Sub5 local10 = this.aClass159_2.method4551((long) arg0);
		if (local10 != null) {
			return (Class8_Sub5_Sub14) local10;
		}
		@Pc(21) byte[] local21 = this.aClass237_59.method6305(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class8_Sub5_Sub14 local33 = new Class8_Sub5_Sub14(new Class8_Sub8(local21));
			this.aClass159_2.method4549((long) arg0, local33);
			return local33;
		}
	}
}
