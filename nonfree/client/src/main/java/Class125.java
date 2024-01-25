import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class125 {

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "Z")
	public boolean aBoolean229 = false;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public int anInt3349 = 64;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
	public int anInt3350 = 1;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
	public int anInt3354 = 64;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "Z")
	public boolean aBoolean230 = false;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	public int anInt3353 = -1;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
	public int anInt3356 = 2;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!ge;II)V")
	private void method2926(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt3353 = arg1.method3967();
			if (this.anInt3353 == 65535) {
				this.anInt3353 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt3349 = arg1.method3967() + 1;
			this.anInt3354 = arg1.method3967() + 1;
		} else if (arg0 == 3) {
			arg1.method3928();
		} else if (arg0 == 4) {
			this.anInt3356 = arg1.method3922();
		} else if (arg0 == 5) {
			this.anInt3350 = arg1.method3922();
		} else if (arg0 == 6) {
			this.aBoolean229 = true;
		} else if (arg0 == 7) {
			this.aBoolean230 = true;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ge;II)V")
	public void method2928(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3922();
			if (local5 == 0) {
				return;
			}
			this.method2926(local5, arg0, arg1);
		}
	}
}
