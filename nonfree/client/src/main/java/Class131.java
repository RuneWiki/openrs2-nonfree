import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class131 {

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
	private int anInt3949;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	public int anInt3952;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
	public int anInt3954;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!kh;)V")
	public void method3519(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub25 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method5185();
			if (local14 == 0) {
				return;
			}
			this.method3524(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)Lclient!lg;")
	public Class125 method3522() {
		@Pc(20) Class125 local20 = (Class125) Static182.aClass26_32.method332((long) this.anInt3949);
		if (local20 != null) {
			return local20;
		}
		local20 = Static368.method2857(Static286.aClass144_92, this.anInt3949, 0);
		if (local20 != null) {
			Static182.aClass26_32.method330((long) this.anInt3949, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!kh;I)V")
	private void method3524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11_Sub25 arg2) {
		if (arg0 == 1) {
			this.anInt3949 = arg2.method5187();
		} else if (arg0 == 2) {
			this.anInt3954 = arg2.method5185();
			this.anInt3952 = arg2.method5185();
		}
	}
}
