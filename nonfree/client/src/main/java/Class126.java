import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class126 {

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
	public int anInt4628;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
	public int anInt4635;

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "Z")
	public boolean aBoolean244 = false;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!im;IB)V")
	public void method3677(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method2655();
			if (local17 == 0) {
				return;
			}
			this.method3678(arg0, arg1, local17);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!im;IBI)V")
	private void method3678(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4628 = arg0.method2652();
		} else if (arg2 == 2) {
			this.anInt4635 = arg0.method2634();
		} else if (arg2 == 3) {
			this.aBoolean244 = true;
		} else if (arg2 == 4) {
			this.anInt4628 = -1;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZI)Lclient!ag;")
	public Class7_Sub1 method3681(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class7_Sub1 local19 = (Class7_Sub1) Static183.aClass155_35.method4358((long) ((arg0 ? 262144 : 0) | this.anInt4628 | arg1 << 16));
		if (local19 != null) {
			return local19;
		}
		Static83.aClass83_52.method2302(this.anInt4628);
		local19 = Static126.method2148(this.anInt4628, Static83.aClass83_52);
		if (local19 != null) {
			local19.method124(Static38.anInt1156, Static238.anInt5221, Static16.anInt452);
			local19.anInt5425 = local19.anInt5433;
			local19.anInt5424 = local19.anInt5432;
			if (arg0) {
				local19.method131();
			}
			for (@Pc(66) int local66 = 0; local66 < arg1; local66++) {
				local19.method127();
			}
			Static183.aClass155_35.method4360((long) ((arg0 ? 262144 : 0) | arg1 << 16 | this.anInt4628), local19);
		}
		return local19;
	}
}
