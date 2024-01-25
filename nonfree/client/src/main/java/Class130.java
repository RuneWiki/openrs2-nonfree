import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class130 {

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Z")
	public boolean aBoolean232;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	public int anInt3200;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	public int anInt3201;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public int anInt3202;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
	public int anInt3204;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
	public int anInt3205;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public int anInt3211;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
	public int anInt3212;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	public int anInt3214;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
	public int anInt3207 = 16777215;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
	public int anInt3215 = 8;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!jc;I)V")
	private void method2827(@OriginalArg(1) Class14_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3215 = arg0.method7717(-1978450544);
		} else if (arg1 == 2) {
			this.aBoolean232 = true;
		} else if (arg1 == 3) {
			this.anInt3211 = arg0.method7752();
			this.anInt3202 = arg0.method7752();
			this.anInt3214 = arg0.method7752();
		} else if (arg1 == 4) {
			this.anInt3200 = arg0.method7695(100);
		} else if (arg1 == 5) {
			this.anInt3212 = arg0.method7717(-1978450544);
		} else if (arg1 == 6) {
			this.anInt3207 = arg0.method7719();
		} else if (arg1 == 7) {
			this.anInt3204 = arg0.method7752();
			this.anInt3201 = arg0.method7752();
			this.anInt3205 = arg0.method7752();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!jc;)V")
	public void method2831(@OriginalArg(1) Class14_Sub21 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method7695(112);
			if (local10 == 0) {
				return;
			}
			this.method2827(arg0, local10);
		}
	}
}
