import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class217 implements Interface13 {

	@OriginalMember(owner = "client!om", name = "a", descriptor = "Lclient!fn;")
	private final Class105 aClass105_2 = new Class105(256);

	@OriginalMember(owner = "client!om", name = "i", descriptor = "Lclient!dn;")
	private final Class69 aClass69_68;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Lclient!dn;")
	private final Class69 aClass69_67;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "I")
	private final int anInt6422;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "[Lclient!uk;")
	private final Class296[] aClass296Array1;

	static {
		new Class45(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!dn;Lclient!dn;Lclient!dn;)V")
	public Class217(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_68 = arg2;
		this.aClass69_67 = arg1;
		@Pc(24) Class1_Sub17 local24 = new Class1_Sub17(arg0.method1888(0, 0));
		this.anInt6422 = local24.method4494();
		this.aClass296Array1 = new Class296[this.anInt6422];
		for (@Pc(36) int local36 = 0; local36 < this.anInt6422; local36++) {
			if (local24.method4487() == 1) {
				this.aClass296Array1[local36] = new Class296();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt6422; local57++) {
			if (this.aClass296Array1[local57] != null) {
				this.aClass296Array1[local57].aBoolean640 = local24.method4487() == 0;
			}
		}
		for (@Pc(86) int local86 = 0; local86 < this.anInt6422; local86++) {
			if (this.aClass296Array1[local86] != null) {
				this.aClass296Array1[local86].aBoolean641 = local24.method4487() == 1;
			}
		}
		for (@Pc(119) int local119 = 0; local119 < this.anInt6422; local119++) {
			if (this.aClass296Array1[local119] != null) {
				this.aClass296Array1[local119].aBoolean638 = local24.method4487() == 1;
			}
		}
		for (@Pc(146) int local146 = 0; local146 < this.anInt6422; local146++) {
			if (this.aClass296Array1[local146] != null) {
				this.aClass296Array1[local146].aBoolean642 = local24.method4487() == 1;
			}
		}
		for (@Pc(175) int local175 = 0; local175 < this.anInt6422; local175++) {
			if (this.aClass296Array1[local175] != null) {
				this.aClass296Array1[local175].aByte99 = local24.method4482();
			}
		}
		for (@Pc(201) int local201 = 0; local201 < this.anInt6422; local201++) {
			if (this.aClass296Array1[local201] != null) {
				this.aClass296Array1[local201].aByte103 = local24.method4482();
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.anInt6422; local223++) {
			if (this.aClass296Array1[local223] != null) {
				this.aClass296Array1[local223].aByte104 = local24.method4482();
			}
		}
		for (@Pc(249) int local249 = 0; local249 < this.anInt6422; local249++) {
			if (this.aClass296Array1[local249] != null) {
				this.aClass296Array1[local249].aByte100 = local24.method4482();
			}
		}
		for (@Pc(271) int local271 = 0; local271 < this.anInt6422; local271++) {
			if (this.aClass296Array1[local271] != null) {
				this.aClass296Array1[local271].aShort116 = (short) local24.method4494();
			}
		}
		for (@Pc(294) int local294 = 0; local294 < this.anInt6422; local294++) {
			if (this.aClass296Array1[local294] != null) {
				this.aClass296Array1[local294].aByte101 = local24.method4482();
			}
		}
		for (@Pc(316) int local316 = 0; local316 < this.anInt6422; local316++) {
			if (this.aClass296Array1[local316] != null) {
				this.aClass296Array1[local316].aByte105 = local24.method4482();
			}
		}
		for (@Pc(342) int local342 = 0; local342 < this.anInt6422; local342++) {
			if (this.aClass296Array1[local342] != null) {
				this.aClass296Array1[local342].aBoolean639 = local24.method4487() == 1;
			}
		}
		for (@Pc(375) int local375 = 0; local375 < this.anInt6422; local375++) {
			if (this.aClass296Array1[local375] != null) {
				this.aClass296Array1[local375].aBoolean646 = local24.method4487() == 1;
			}
		}
		for (@Pc(408) int local408 = 0; local408 < this.anInt6422; local408++) {
			if (this.aClass296Array1[local408] != null) {
				this.aClass296Array1[local408].aByte102 = local24.method4482();
			}
		}
		for (@Pc(430) int local430 = 0; local430 < this.anInt6422; local430++) {
			if (this.aClass296Array1[local430] != null) {
				this.aClass296Array1[local430].aBoolean645 = local24.method4487() == 1;
			}
		}
		for (@Pc(459) int local459 = 0; local459 < this.anInt6422; local459++) {
			if (this.aClass296Array1[local459] != null) {
				this.aClass296Array1[local459].aBoolean643 = local24.method4487() == 1;
			}
		}
		for (@Pc(490) int local490 = 0; local490 < this.anInt6422; local490++) {
			if (this.aClass296Array1[local490] != null) {
				this.aClass296Array1[local490].aBoolean644 = local24.method4487() == 1;
			}
		}
		for (@Pc(519) int local519 = 0; local519 < this.anInt6422; local519++) {
			if (this.aClass296Array1[local519] != null) {
				this.aClass296Array1[local519].anInt8644 = local24.method4487();
			}
		}
		for (@Pc(545) int local545 = 0; local545 < this.anInt6422; local545++) {
			if (this.aClass296Array1[local545] != null) {
				this.aClass296Array1[local545].anInt8641 = local24.method4481();
			}
		}
		for (@Pc(571) int local571 = 0; local571 < this.anInt6422; local571++) {
			if (this.aClass296Array1[local571] != null) {
				this.aClass296Array1[local571].aBoolean637 = local24.method4487() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method5788(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub8 local13 = this.method5792(arg0);
		return local13 != null && local13.method3620(this.aClass69_68, this);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIFIZI)[F")
	@Override
	public float[] method5787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(5) int arg3) {
		return this.method5792(arg3).method3615(arg1, this.aClass69_68, this.aClass296Array1[arg3].aBoolean646, this, arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)I")
	@Override
	public int method5785() {
		return this.anInt6422;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZFIII)[I")
	@Override
	public int[] method5790(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method5792(arg3).method3618(this.aClass296Array1[arg3].aBoolean646, arg1, (double) arg2, arg4, this, arg0, this.aClass69_68);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(FIIZII)[I")
	@Override
	public int[] method5786(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method5792(arg3).method3616(this, this.aClass69_68, (double) arg0, arg1, this.aClass296Array1[arg3].aBoolean646, arg2);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)Lclient!ht;")
	private Class1_Sub2_Sub8 method5792(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2 local10 = this.aClass105_2.method2605((long) arg0);
		if (local10 != null) {
			return (Class1_Sub2_Sub8) local10;
		}
		@Pc(21) byte[] local21 = this.aClass69_67.method1890(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(40) Class1_Sub2_Sub8 local40 = new Class1_Sub2_Sub8(new Class1_Sub17(local21));
			this.aClass105_2.method2600(local40, (long) arg0);
			return local40;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Lclient!uk;")
	@Override
	public Class296 method5789(@OriginalArg(1) int arg0) {
		return this.aClass296Array1[arg0];
	}
}
