import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class46 implements Interface2 {

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
	private int anInt2354 = 128;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	private int anInt2338 = 50;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!ke;")
	private final Class43 aClass43_26;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Lclient!ke;")
	private final Class43 aClass43_25;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!ua;")
	private Class82 aClass82_39;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ke;Lclient!ke;II)V")
	public Class46(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2354 = arg3;
		this.aClass43_26 = arg1;
		this.aClass43_25 = arg0;
		this.anInt2338 = arg2;
		this.aClass82_39 = new Class82(this.anInt2338);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1659(@OriginalArg(1) int arg0) {
		return this.anInt2354 == 64 || this.method1665(arg0).anInt1423 == 64;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method1661(@OriginalArg(0) int arg0) {
		return this.method1665(arg0).aBoolean75;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIF)[I")
	@Override
	public int[] method1657(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		@Pc(13) Class2_Sub2_Sub8 local13 = this.method1665(arg0);
		local13.aBoolean74 = true;
		return local13.method984(this, this.anInt2354, arg1, this.aClass43_26);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)I")
	@Override
	public int method1655(@OriginalArg(0) int arg0) {
		return this.method1665(arg0).anInt1412;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1656(@OriginalArg(0) int arg0) {
		return this.method1665(arg0).aBoolean73;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(IB)Lclient!gb;")
	private Class2_Sub2_Sub8 method1665(@OriginalArg(0) int arg0) {
		@Pc(19) Class2_Sub2_Sub8 local19 = (Class2_Sub2_Sub8) this.aClass82_39.method2699((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(30) byte[] local30 = this.aClass43_25.method2205(arg0, 0);
		if (local30 == null) {
			return Static94.method1687();
		} else {
			@Pc(40) Class2_Sub18 local40 = new Class2_Sub18(local30);
			local19 = new Class2_Sub2_Sub8(local40);
			this.aClass82_39.method2701((long) arg0, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1658(@OriginalArg(0) int arg0) {
		return this.method1665(arg0).method983(this.aClass43_26, this);
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method1660(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub18 local13 = new Class2_Sub18(this.aClass43_25.method2205(arg0, 0));
		@Pc(18) Class2_Sub2_Sub8 local18 = new Class2_Sub2_Sub8(local13);
		return local18.method985(this.anInt2354, this, this.aClass43_26);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(BI)V")
	public void method1666(@OriginalArg(1) int arg0) {
		for (@Pc(11) Class2_Sub2_Sub8 local11 = (Class2_Sub2_Sub8) this.aClass82_39.method2700(); local11 != null; local11 = (Class2_Sub2_Sub8) this.aClass82_39.method2702()) {
			if (local11.aBoolean74) {
				local11.method982(arg0);
				local11.aBoolean74 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public void method1667() {
		this.aClass82_39 = new Class82(this.anInt2338);
	}
}
