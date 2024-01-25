import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class274 implements Interface7 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!gea;")
	private final Class117 aClass117_3 = new Class117(256);

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Lclient!ni;")
	private final Class223 aClass223_108;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Lclient!ni;")
	private final Class223 aClass223_107;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	private final int anInt8252;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "[Lclient!pba;")
	private final Class254[] aClass254Array1;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!ni;Lclient!ni;Lclient!ni;)V")
	public Class274(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_108 = arg1;
		this.aClass223_107 = arg2;
		@Pc(24) Class6_Sub8 local24 = new Class6_Sub8(arg0.method5954(0, 0));
		this.anInt8252 = local24.method8220();
		this.aClass254Array1 = new Class254[this.anInt8252];
		for (@Pc(36) int local36 = 0; local36 < this.anInt8252; local36++) {
			if (local24.method8246() == 1) {
				this.aClass254Array1[local36] = new Class254();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt8252; local57++) {
			if (this.aClass254Array1[local57] != null) {
				this.aClass254Array1[local57].aBoolean618 = local24.method8246() == 0;
			}
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt8252; local90++) {
			if (this.aClass254Array1[local90] != null) {
				this.aClass254Array1[local90].aBoolean616 = local24.method8246() == 1;
			}
		}
		for (@Pc(123) int local123 = 0; local123 < this.anInt8252; local123++) {
			if (this.aClass254Array1[local123] != null) {
				this.aClass254Array1[local123].aBoolean621 = local24.method8246() == 1;
			}
		}
		for (@Pc(154) int local154 = 0; local154 < this.anInt8252; local154++) {
			if (this.aClass254Array1[local154] != null) {
				this.aClass254Array1[local154].aByte97 = local24.method8208();
			}
		}
		for (@Pc(176) int local176 = 0; local176 < this.anInt8252; local176++) {
			if (this.aClass254Array1[local176] != null) {
				this.aClass254Array1[local176].aByte98 = local24.method8208();
			}
		}
		for (@Pc(198) int local198 = 0; local198 < this.anInt8252; local198++) {
			if (this.aClass254Array1[local198] != null) {
				this.aClass254Array1[local198].aByte95 = local24.method8208();
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.anInt8252; local224++) {
			if (this.aClass254Array1[local224] != null) {
				this.aClass254Array1[local224].aByte94 = local24.method8208();
			}
		}
		for (@Pc(250) int local250 = 0; local250 < this.anInt8252; local250++) {
			if (this.aClass254Array1[local250] != null) {
				this.aClass254Array1[local250].aShort91 = (short) local24.method8220();
			}
		}
		for (@Pc(277) int local277 = 0; local277 < this.anInt8252; local277++) {
			if (this.aClass254Array1[local277] != null) {
				this.aClass254Array1[local277].aByte96 = local24.method8208();
			}
		}
		for (@Pc(299) int local299 = 0; local299 < this.anInt8252; local299++) {
			if (this.aClass254Array1[local299] != null) {
				this.aClass254Array1[local299].aByte100 = local24.method8208();
			}
		}
		for (@Pc(321) int local321 = 0; local321 < this.anInt8252; local321++) {
			if (this.aClass254Array1[local321] != null) {
				this.aClass254Array1[local321].aBoolean620 = local24.method8246() == 1;
			}
		}
		for (@Pc(348) int local348 = 0; local348 < this.anInt8252; local348++) {
			if (this.aClass254Array1[local348] != null) {
				this.aClass254Array1[local348].aBoolean617 = local24.method8246() == 1;
			}
		}
		for (@Pc(375) int local375 = 0; local375 < this.anInt8252; local375++) {
			if (this.aClass254Array1[local375] != null) {
				this.aClass254Array1[local375].aByte99 = local24.method8208();
			}
		}
		for (@Pc(397) int local397 = 0; local397 < this.anInt8252; local397++) {
			if (this.aClass254Array1[local397] != null) {
				this.aClass254Array1[local397].aBoolean619 = local24.method8246() == 1;
			}
		}
		for (@Pc(430) int local430 = 0; local430 < this.anInt8252; local430++) {
			if (this.aClass254Array1[local430] != null) {
				this.aClass254Array1[local430].aBoolean615 = local24.method8246() == 1;
			}
		}
		for (@Pc(457) int local457 = 0; local457 < this.anInt8252; local457++) {
			if (this.aClass254Array1[local457] != null) {
				this.aClass254Array1[local457].aBoolean614 = local24.method8246() == 1;
			}
		}
		for (@Pc(488) int local488 = 0; local488 < this.anInt8252; local488++) {
			if (this.aClass254Array1[local488] != null) {
				this.aClass254Array1[local488].anInt7797 = local24.method8246();
			}
		}
		for (@Pc(514) int local514 = 0; local514 < this.anInt8252; local514++) {
			if (this.aClass254Array1[local514] != null) {
				this.aClass254Array1[local514].anInt7800 = local24.method8236();
			}
		}
		for (@Pc(536) int local536 = 0; local536 < this.anInt8252; local536++) {
			if (this.aClass254Array1[local536] != null) {
				this.aClass254Array1[local536].anInt7796 = local24.method8246();
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIFZI)[I")
	@Override
	public int[] method6933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3) {
		return this.method6934(arg1).method5768(this.aClass254Array1[arg1].aBoolean617, (double) arg2, arg3, this, this.aClass223_107, arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)I")
	@Override
	public int method6932() {
		return this.anInt8252;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)Lclient!mp;")
	private Class6_Sub5_Sub21 method6934(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub5 local10 = this.aClass117_3.method3389((long) arg0);
		if (local10 != null) {
			return (Class6_Sub5_Sub21) local10;
		}
		@Pc(21) byte[] local21 = this.aClass223_108.method5942(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(38) Class6_Sub5_Sub21 local38 = new Class6_Sub5_Sub21(new Class6_Sub8(local21));
			this.aClass117_3.method3390(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIFZI)[I")
	@Override
	public int[] method6929(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method6934(arg0).method5766(arg1, arg3, this, (double) arg2, this.aClass254Array1[arg0].aBoolean617, this.aClass223_107, arg4);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6928(@OriginalArg(1) int arg0) {
		@Pc(16) Class6_Sub5_Sub21 local16 = this.method6934(arg0);
		return local16 != null && local16.method5764(this.aClass223_107, this);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BZIIFI)[F")
	@Override
	public float[] method6930(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method6934(arg0).method5765(this, this.aClass223_107, arg3, arg1, this.aClass254Array1[arg0].aBoolean617);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Lclient!pba;")
	@Override
	public Class254 method6931(@OriginalArg(0) int arg0) {
		return this.aClass254Array1[arg0];
	}
}
