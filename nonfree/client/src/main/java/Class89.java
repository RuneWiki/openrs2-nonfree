import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class89 implements Interface1 {

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
	private int anInt3290 = 128;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
	private int anInt3292 = 50;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Lclient!wa;")
	private final Class23 aClass23_59;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!wa;")
	private final Class23 aClass23_58;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!bb;")
	private Class8 aClass8_32;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!wa;Lclient!wa;II)V")
	public Class89(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3290 = arg3;
		this.aClass23_59 = arg1;
		this.aClass23_58 = arg0;
		this.anInt3292 = arg2;
		this.aClass8_32 = new Class8(this.anInt3292);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IZ)Z")
	@Override
	public boolean method2492(@OriginalArg(0) int arg0) {
		return this.anInt3290 == 64 || this.method2496(arg0).anInt3512 == 64;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2486(@OriginalArg(1) int arg0) {
		@Pc(14) Class5_Sub2_Sub19 local14 = this.method2496(arg0);
		return local14.method2663(this.aClass23_59, this.anInt3290, this);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method2487(@OriginalArg(1) int arg0) {
		return this.method2496(arg0).aBoolean157;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)I")
	@Override
	public int method2489(@OriginalArg(0) int arg0) {
		return this.method2496(arg0).anInt3504;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public void method2493() {
		this.aClass8_32 = new Class8(this.anInt3292);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IZ)V")
	public void method2494(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class5_Sub2_Sub19 local11 = (Class5_Sub2_Sub19) this.aClass8_32.method234(); local11 != null; local11 = (Class5_Sub2_Sub19) this.aClass8_32.method230()) {
			if (local11.aBoolean159) {
				local11.method2664(arg0);
				local11.aBoolean159 = false;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IFI)[I")
	@Override
	public int[] method2491(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub2_Sub19 local13 = this.method2496(arg1);
		local13.aBoolean159 = true;
		return local13.method2668(arg0, this, this.aClass23_59, this.anInt3290);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method2488(@OriginalArg(0) int arg0) {
		return this.method2496(arg0).aBoolean160;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method2490(@OriginalArg(0) int arg0) {
		return this.method2496(arg0).method2666(this.aClass23_59, this);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)Lclient!sd;")
	private Class5_Sub2_Sub19 method2496(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub2_Sub19 local11 = (Class5_Sub2_Sub19) this.aClass8_32.method227((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(30) byte[] local30 = this.aClass23_58.method738(arg0, 0);
		if (local30 == null) {
			return Static109.method1750();
		} else {
			@Pc(40) Class5_Sub6 local40 = new Class5_Sub6(local30);
			local11 = new Class5_Sub2_Sub19(local40);
			this.aClass8_32.method232((long) arg0, local11);
			return local11;
		}
	}
}
