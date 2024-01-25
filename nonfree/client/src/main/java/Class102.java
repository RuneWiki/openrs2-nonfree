import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class102 {

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
	private int anInt3104;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
	public int anInt3105;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
	public int anInt3106;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "J")
	public long aLong89;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
	public int anInt3110;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
	public int anInt3111;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
	public int anInt3113;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
	public int anInt3115;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
	public int anInt3116;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
	public int anInt3117;

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
	public int anInt3119;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
	public int anInt3103 = 0;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
	public int anInt3109 = 0;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!daa;I)V")
	private void method2813(@OriginalArg(1) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3104 = arg0.method5199();
		} else if (arg1 == 2) {
			arg0.method5216();
		} else if (arg1 == 3) {
			this.anInt3115 = arg0.method5225();
			this.anInt3116 = arg0.method5225();
			this.anInt3105 = arg0.method5225();
		} else if (arg1 == 4) {
			this.anInt3117 = arg0.method5216();
			this.anInt3113 = arg0.method5225();
		} else if (arg1 == 6) {
			this.anInt3110 = arg0.method5216();
		} else if (arg1 == 8) {
			this.anInt3109 = 1;
		} else if (arg1 == 9) {
			this.anInt3103 = 1;
		} else if (arg1 == 10) {
			this.aBoolean249 = true;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method2816() {
		this.anInt3111 = Class12_Sub1_Sub36.anIntArray668[this.anInt3104 << 3];
		this.anInt3106 = (int) Math.sqrt((double) (this.anInt3115 * this.anInt3115 + this.anInt3116 * this.anInt3116 + this.anInt3105 * this.anInt3105));
		if (this.anInt3113 == 0) {
			this.anInt3113 = 1;
		}
		if (this.anInt3117 == 0) {
			this.aLong89 = 2147483647L;
		} else if (this.anInt3117 == 1) {
			this.aLong89 = this.anInt3106 * 8 / this.anInt3113;
			this.aLong89 *= this.aLong89;
		} else if (this.anInt3117 == 2) {
			this.aLong89 = this.anInt3106 * 8 / this.anInt3113;
		}
		if (this.aBoolean249) {
			this.anInt3106 *= -1;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!daa;B)V")
	public void method2817(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5216();
			if (local5 == 0) {
				return;
			}
			this.method2813(arg0, local5);
		}
	}
}
