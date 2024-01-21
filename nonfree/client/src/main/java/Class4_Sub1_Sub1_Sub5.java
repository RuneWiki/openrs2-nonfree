import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class4_Sub1_Sub1_Sub5 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!ea", name = "T", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!ea", name = "fb", descriptor = "I")
	private int anInt1009 = 0;

	@OriginalMember(owner = "client!ea", name = "mb", descriptor = "I")
	private int anInt1015 = 0;

	@OriginalMember(owner = "client!ea", name = "kb", descriptor = "I")
	public final int anInt1014;

	@OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
	public final int anInt1007;

	@OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
	private final int anInt1001;

	@OriginalMember(owner = "client!ea", name = "jb", descriptor = "I")
	public final int anInt1013;

	@OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
	public final int anInt1005;

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
	public final int anInt999;

	@OriginalMember(owner = "client!ea", name = "bb", descriptor = "Lclient!ca;")
	private Class4_Sub1_Sub4 aClass4_Sub1_Sub4_3;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIII)V")
	public Class4_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1014 = arg3;
		this.anInt1007 = arg2;
		this.anInt1001 = arg0;
		this.anInt1013 = arg6 + arg5;
		this.anInt1005 = arg1;
		this.anInt999 = arg4;
		@Pc(36) int local36 = Static93.method1816(this.anInt1001).anInt1398;
		if (local36 == -1) {
			this.aBoolean52 = true;
		} else {
			this.aBoolean52 = false;
			this.aClass4_Sub1_Sub4_3 = Static137.method2394(local36);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	public void method677(@OriginalArg(0) int arg0) {
		if (this.aBoolean52) {
			return;
		}
		this.anInt1009 += arg0;
		while (this.aClass4_Sub1_Sub4_3.anIntArray50[this.anInt1015] < this.anInt1009) {
			this.anInt1009 -= this.aClass4_Sub1_Sub4_3.anIntArray50[this.anInt1015];
			this.anInt1015++;
			if (this.aClass4_Sub1_Sub4_3.anIntArray52.length <= this.anInt1015) {
				this.aBoolean52 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)Lclient!dg;")
	@Override
	protected Class4_Sub1_Sub1_Sub4 method2820() {
		@Pc(15) Class4_Sub1_Sub8 local15 = Static93.method1816(this.anInt1001);
		@Pc(23) Class4_Sub1_Sub1_Sub4 local23;
		if (this.aBoolean52) {
			local23 = local15.method1095(-1);
		} else {
			local23 = local15.method1095(this.anInt1015);
		}
		return local23 == null ? null : local23;
	}
}
