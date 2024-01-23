import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class140 {

	@OriginalMember(owner = "client!po", name = "d", descriptor = "I")
	public int anInt4522;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "I")
	public int anInt4531;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "Z")
	public boolean aBoolean302 = false;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIZ)Lclient!ka;")
	public Class93_Sub1 method3671(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(25) Class93_Sub1 local25 = (Class93_Sub1) Static257.aClass157_41.method4031((long) ((arg1 ? 262144 : 0) | arg0 << 16 | this.anInt4522));
		if (local25 != null) {
			return local25;
		}
		Static98.aClass42_24.method1253(this.anInt4522);
		local25 = Static245.method3900(this.anInt4522, Static98.aClass42_24);
		if (local25 != null) {
			local25.method2568(Static155.anInt3465, Static301.anInt5805, Static220.anInt4520);
			local25.anInt4361 = local25.anInt4355;
			local25.anInt4354 = local25.anInt4359;
			if (arg1) {
				local25.method2572();
			}
			for (@Pc(66) int local66 = 0; local66 < arg0; local66++) {
				local25.method2569();
			}
			Static257.aClass157_41.method4026((long) ((arg1 ? 262144 : 0) | this.anInt4522 | arg0 << 16), local25);
		}
		return local25;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIILclient!oe;)V")
	private void method3673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub16 arg2) {
		if (arg0 == 1) {
			this.anInt4522 = arg2.method2130();
		} else if (arg0 == 2) {
			this.anInt4531 = arg2.method2166();
		} else if (arg0 == 3) {
			this.aBoolean302 = true;
		} else if (arg0 == 4) {
			this.anInt4522 = -1;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!oe;I)V")
	public void method3674(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method2146();
			if (local9 == 0) {
				return;
			}
			this.method3673(local9, arg1, arg0);
		}
	}
}
