import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class247 implements Interface11 {

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "Lclient!vl;")
	private final Class379 aClass379_3 = new Class379(256);

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "Lclient!lga;")
	private final Class223 aClass223_85;

	@OriginalMember(owner = "client!nea", name = "h", descriptor = "Lclient!lga;")
	private final Class223 aClass223_84;

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
	private final int anInt6786;

	@OriginalMember(owner = "client!nea", name = "m", descriptor = "[Lclient!qf;")
	private final Class297[] aClass297Array1;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!lga;Lclient!lga;Lclient!lga;)V")
	public Class247(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_85 = arg2;
		this.aClass223_84 = arg1;
		@Pc(24) Class6_Sub15 local24 = new Class6_Sub15(arg0.method5267(0, 0));
		this.anInt6786 = local24.method3018();
		this.aClass297Array1 = new Class297[this.anInt6786];
		for (@Pc(36) int local36 = 0; local36 < this.anInt6786; local36++) {
			if (local24.method3030() == 1) {
				this.aClass297Array1[local36] = new Class297();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt6786; local61++) {
			if (this.aClass297Array1[local61] != null) {
				this.aClass297Array1[local61].aBoolean625 = local24.method3030() == 0;
			}
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt6786; local101++) {
			if (this.aClass297Array1[local101] != null) {
				this.aClass297Array1[local101].aBoolean630 = local24.method3030() == 1;
			}
		}
		for (@Pc(137) int local137 = 0; local137 < this.anInt6786; local137++) {
			if (this.aClass297Array1[local137] != null) {
				this.aClass297Array1[local137].aBoolean627 = local24.method3030() == 1;
			}
		}
		for (@Pc(173) int local173 = 0; local173 < this.anInt6786; local173++) {
			if (this.aClass297Array1[local173] != null) {
				this.aClass297Array1[local173].aByte123 = local24.method3027();
			}
		}
		for (@Pc(201) int local201 = 0; local201 < this.anInt6786; local201++) {
			if (this.aClass297Array1[local201] != null) {
				this.aClass297Array1[local201].aByte118 = local24.method3027();
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.anInt6786; local233++) {
			if (this.aClass297Array1[local233] != null) {
				this.aClass297Array1[local233].aByte124 = local24.method3027();
			}
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt6786; local265++) {
			if (this.aClass297Array1[local265] != null) {
				this.aClass297Array1[local265].aByte122 = local24.method3027();
			}
		}
		for (@Pc(293) int local293 = 0; local293 < this.anInt6786; local293++) {
			if (this.aClass297Array1[local293] != null) {
				this.aClass297Array1[local293].aShort98 = (short) local24.method3018();
			}
		}
		for (@Pc(326) int local326 = 0; local326 < this.anInt6786; local326++) {
			if (this.aClass297Array1[local326] != null) {
				this.aClass297Array1[local326].aByte121 = local24.method3027();
			}
		}
		for (@Pc(354) int local354 = 0; local354 < this.anInt6786; local354++) {
			if (this.aClass297Array1[local354] != null) {
				this.aClass297Array1[local354].aByte119 = local24.method3027();
			}
		}
		for (@Pc(382) int local382 = 0; local382 < this.anInt6786; local382++) {
			if (this.aClass297Array1[local382] != null) {
				this.aClass297Array1[local382].aBoolean628 = local24.method3030() == 1;
			}
		}
		for (@Pc(422) int local422 = 0; local422 < this.anInt6786; local422++) {
			if (this.aClass297Array1[local422] != null) {
				this.aClass297Array1[local422].aBoolean624 = local24.method3030() == 1;
			}
		}
		for (@Pc(456) int local456 = 0; local456 < this.anInt6786; local456++) {
			if (this.aClass297Array1[local456] != null) {
				this.aClass297Array1[local456].aByte120 = local24.method3027();
			}
		}
		for (@Pc(484) int local484 = 0; local484 < this.anInt6786; local484++) {
			if (this.aClass297Array1[local484] != null) {
				this.aClass297Array1[local484].aBoolean631 = local24.method3030() == 1;
			}
		}
		for (@Pc(520) int local520 = 0; local520 < this.anInt6786; local520++) {
			if (this.aClass297Array1[local520] != null) {
				this.aClass297Array1[local520].aBoolean629 = local24.method3030() == 1;
			}
		}
		for (@Pc(556) int local556 = 0; local556 < this.anInt6786; local556++) {
			if (this.aClass297Array1[local556] != null) {
				this.aClass297Array1[local556].aBoolean626 = local24.method3030() == 1;
			}
		}
		for (@Pc(596) int local596 = 0; local596 < this.anInt6786; local596++) {
			if (this.aClass297Array1[local596] != null) {
				this.aClass297Array1[local596].anInt8254 = local24.method3030();
			}
		}
		for (@Pc(624) int local624 = 0; local624 < this.anInt6786; local624++) {
			if (this.aClass297Array1[local624] != null) {
				this.aClass297Array1[local624].anInt8253 = local24.method3015();
			}
		}
		for (@Pc(652) int local652 = 0; local652 < this.anInt6786; local652++) {
			if (this.aClass297Array1[local652] != null) {
				this.aClass297Array1[local652].anInt8252 = local24.method3030();
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIZFI)[I")
	@Override
	public int[] method6029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method6034(arg3).method6626((double) arg2, arg0, this.aClass297Array1[arg3].aBoolean624, this, this.aClass223_85, arg1);
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(II)Lclient!qf;")
	@Override
	public Class297 method6027(@OriginalArg(1) int arg0) {
		return this.aClass297Array1[arg0];
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZIIIZF)[F")
	@Override
	public float[] method6030(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3) {
		return this.method6034(arg1).method6627(this.aClass297Array1[arg1].aBoolean624, this, arg0, arg2, this.aClass223_85);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(FIIIIZ)[I")
	@Override
	public int[] method6031(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method6034(arg3).method6625((double) arg0, this, arg1, this.aClass223_85, arg2, arg4, this.aClass297Array1[arg3].aBoolean624);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)I")
	@Override
	public int method6028() {
		return this.anInt6786;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6032(@OriginalArg(0) int arg0) {
		@Pc(16) Class6_Sub2_Sub15 local16 = this.method6034(arg0);
		return local16 != null && local16.method6629(this.aClass223_85, 255, this);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BI)Lclient!oq;")
	private Class6_Sub2_Sub15 method6034(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub2 local10 = this.aClass379_3.method8729((long) arg0);
		if (local10 != null) {
			return (Class6_Sub2_Sub15) local10;
		}
		@Pc(22) byte[] local22 = this.aClass223_84.method5275(arg0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(43) Class6_Sub2_Sub15 local43 = new Class6_Sub2_Sub15(new Class6_Sub15(local22));
			this.aClass379_3.method8733((long) arg0, local43);
			return local43;
		}
	}
}
