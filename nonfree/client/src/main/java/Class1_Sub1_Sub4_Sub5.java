import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class1_Sub1_Sub4_Sub5 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!hh", name = "fb", descriptor = "I")
	private int anInt2221 = 0;

	@OriginalMember(owner = "client!hh", name = "kb", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
	private int anInt2218 = 0;

	@OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
	public final int anInt2213;

	@OriginalMember(owner = "client!hh", name = "lb", descriptor = "I")
	public final int anInt2225;

	@OriginalMember(owner = "client!hh", name = "V", descriptor = "I")
	public final int anInt2214;

	@OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
	public final int anInt2216;

	@OriginalMember(owner = "client!hh", name = "gb", descriptor = "I")
	public final int anInt2222;

	@OriginalMember(owner = "client!hh", name = "mb", descriptor = "I")
	private final int anInt2226;

	@OriginalMember(owner = "client!hh", name = "ab", descriptor = "Lclient!re;")
	private Class1_Sub1_Sub17 aClass1_Sub1_Sub17_2;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub1_Sub4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2213 = arg1;
		this.anInt2225 = arg3;
		this.anInt2214 = arg6 + arg5;
		this.anInt2216 = arg4;
		this.anInt2222 = arg2;
		this.anInt2226 = arg0;
		@Pc(37) int local37 = Static86.method1911(this.anInt2226).anInt4556;
		if (local37 == -1) {
			this.aBoolean75 = true;
		} else {
			this.aBoolean75 = false;
			this.aClass1_Sub1_Sub17_2 = Static90.method1962(local37);
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)Lclient!je;")
	@Override
	protected Class1_Sub1_Sub4_Sub1 method3066() {
		@Pc(18) Class1_Sub1_Sub18 local18 = Static86.method1911(this.anInt2226);
		@Pc(27) Class1_Sub1_Sub4_Sub1 local27;
		if (this.aBoolean75) {
			local27 = local18.method3510(-1);
		} else {
			local27 = local18.method3510(this.anInt2218);
		}
		return local27 == null ? null : local27;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
	public void method1639(@OriginalArg(0) int arg0) {
		if (this.aBoolean75) {
			return;
		}
		this.anInt2221 += arg0;
		while (this.anInt2221 > this.aClass1_Sub1_Sub17_2.anIntArray370[this.anInt2218]) {
			this.anInt2221 -= this.aClass1_Sub1_Sub17_2.anIntArray370[this.anInt2218];
			this.anInt2218++;
			if (this.anInt2218 >= this.aClass1_Sub1_Sub17_2.anIntArray365.length) {
				this.aBoolean75 = true;
				return;
			}
		}
	}
}
