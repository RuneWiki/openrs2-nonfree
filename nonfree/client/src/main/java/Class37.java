import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class37 implements Interface1 {

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "Lclient!ad;")
	private Class5 aClass5_15 = new Class5();

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
	private int anInt1803 = 128;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private int anInt1805 = 0;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private final int anInt1806;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "Lclient!jb;")
	private final Class25 aClass25_14;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "[Lclient!pb;")
	private final Class3_Sub17[] aClass3_Sub17Array1;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!jb;Lclient!jb;IDI)V")
	public Class37(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt1803 = arg4;
		this.aDouble1 = arg3;
		this.anInt1806 = arg2;
		this.aClass25_14 = arg1;
		this.anInt1805 = this.anInt1806;
		@Pc(38) int[] local38 = arg0.method930(0);
		@Pc(41) int local41 = local38.length;
		this.aClass3_Sub17Array1 = new Class3_Sub17[arg0.method911(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class3_Sub12 local63 = new Class3_Sub12(arg0.method931(local38[local50], 0));
			this.aClass3_Sub17Array1[local38[local50]] = new Class3_Sub17(local63);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ID)V")
	public void method1167(@OriginalArg(1) double arg0) {
		this.aDouble1 = arg0;
		this.method1168();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1166(@OriginalArg(0) int arg0) {
		return this.anInt1803 == 64;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method1164(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub17Array1[arg0].aBoolean92;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method1168() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass3_Sub17Array1.length; local7++) {
			if (this.aClass3_Sub17Array1[local7] != null) {
				this.aClass3_Sub17Array1[local7].method1691();
			}
		}
		this.aClass5_15 = new Class5();
		this.anInt1805 = this.anInt1806;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method1165(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17Array1[arg0];
		if (local8 != null) {
			if (local8.anIntArray273 != null) {
				this.aClass5_15.method85(local8);
				local8.aBoolean93 = true;
				return local8.anIntArray273;
			}
			@Pc(38) boolean local38 = local8.method1689(this.aDouble1, this.anInt1803, this.aClass25_14);
			if (local38) {
				if (this.anInt1805 == 0) {
					@Pc(60) Class3_Sub17 local60 = (Class3_Sub17) this.aClass5_15.method81();
					local60.method1691();
				} else {
					this.anInt1805--;
				}
				this.aClass5_15.method85(local8);
				local8.aBoolean93 = true;
				return local8.anIntArray273;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
	public void method1169(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aClass3_Sub17Array1.length; local3++) {
			@Pc(10) Class3_Sub17 local10 = this.aClass3_Sub17Array1[local3];
			if (local10 != null && local10.anInt2617 != 0 && local10.aBoolean93) {
				local10.method1688(arg0);
				local10.aBoolean93 = false;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)I")
	@Override
	public int method1163(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub17Array1[arg0] == null ? 0 : this.aClass3_Sub17Array1[arg0].anInt2616;
	}
}
