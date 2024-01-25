import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class4_Sub1_Sub9 extends Class4_Sub1 {

	@OriginalMember(owner = "client!he", name = "J", descriptor = "Lclient!hl;")
	private Class96 aClass96_18;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!wn;II)V")
	private void method2641(@OriginalArg(0) Class4_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(20) int local20 = arg0.method4614();
		@Pc(27) int local27;
		if (this.aClass96_18 == null) {
			local27 = Static84.method6309(local20);
			this.aClass96_18 = new Class96(local27);
		}
		for (local27 = 0; local27 < local20; local27++) {
			@Pc(46) boolean local46 = arg0.method4614() == 1;
			@Pc(50) int local50 = arg0.method4582();
			@Pc(59) Class4 local59;
			if (local46) {
				local59 = new Class4_Sub12(arg0.method4624());
			} else {
				local59 = new Class4_Sub16(arg0.method4595());
			}
			this.aClass96_18.method2805((long) local50, local59);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLclient!wn;)V")
	public void method2642(@OriginalArg(1) Class4_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4614();
			if (local9 == 0) {
				return;
			}
			this.method2641(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method2645(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass96_18 == null) {
			return arg1;
		} else {
			@Pc(16) Class4_Sub12 local16 = (Class4_Sub12) this.aClass96_18.method2797((long) arg0);
			return local16 == null ? arg1 : local16.aString12;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BII)I")
	public int method2646(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass96_18 == null) {
			return arg1;
		} else {
			@Pc(21) Class4_Sub16 local21 = (Class4_Sub16) this.aClass96_18.method2797((long) arg0);
			return local21 == null ? arg1 : local21.anInt2197;
		}
	}
}
