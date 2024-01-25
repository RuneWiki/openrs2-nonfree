import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public abstract class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!gp", name = "F", descriptor = "Z")
	protected boolean aBoolean385;

	@OriginalMember(owner = "client!gp", name = "L", descriptor = "Z")
	protected boolean aBoolean386;

	@OriginalMember(owner = "client!gp", name = "R", descriptor = "Z")
	public boolean aBoolean389;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
	public int anInt5429 = 2;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "Z")
	public boolean aBoolean379 = true;

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
	public int anInt5431 = 127;

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
	public int anInt5435 = 2;

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "Z")
	public boolean aBoolean383 = true;

	@OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
	public int anInt5443 = 0;

	@OriginalMember(owner = "client!gp", name = "E", descriptor = "I")
	public int anInt5444 = 127;

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
	public int anInt5437 = 2;

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "Z")
	public boolean aBoolean382 = false;

	@OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
	public int anInt5447 = 3;

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
	public int anInt5440 = 3;

	@OriginalMember(owner = "client!gp", name = "U", descriptor = "Z")
	public boolean aBoolean391 = true;

	@OriginalMember(owner = "client!gp", name = "M", descriptor = "Z")
	public boolean aBoolean387 = false;

	@OriginalMember(owner = "client!gp", name = "Q", descriptor = "Z")
	public boolean aBoolean388 = true;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "Z")
	protected boolean aBoolean384 = true;

	@OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
	public int anInt5449 = 1;

	@OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
	public int anInt5439 = 127;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "Z")
	public boolean aBoolean380 = true;

	@OriginalMember(owner = "client!gp", name = "S", descriptor = "I")
	public int anInt5453 = 0;

	@OriginalMember(owner = "client!gp", name = "V", descriptor = "Z")
	public boolean aBoolean392 = true;

	@OriginalMember(owner = "client!gp", name = "Y", descriptor = "Z")
	public boolean aBoolean394 = true;

	@OriginalMember(owner = "client!gp", name = "T", descriptor = "Z")
	public boolean aBoolean390 = true;

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "Z")
	public boolean aBoolean381 = true;

	@OriginalMember(owner = "client!gp", name = "N", descriptor = "I")
	public int anInt5450 = 0;

	@OriginalMember(owner = "client!gp", name = "ab", descriptor = "I")
	public int anInt5456 = 0;

	@OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
	protected int anInt5442 = 2;

	@OriginalMember(owner = "client!gp", name = "X", descriptor = "Z")
	public boolean aBoolean393 = true;

	@OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
	public int anInt5445 = 0;

	@OriginalMember(owner = "client!gp", name = "Z", descriptor = "I")
	public int anInt5455 = 0;

	@OriginalMember(owner = "client!gp", name = "bb", descriptor = "Z")
	public boolean aBoolean395 = true;

	@OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
	protected int anInt5436 = 0;

	@OriginalMember(owner = "client!gp", name = "cb", descriptor = "Z")
	public boolean aBoolean396 = false;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	protected Class1_Sub22() {
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
	public final void method4647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static303.method4788(arg1)) {
			this.anInt5442 = arg0;
		} else {
			this.anInt5436 = arg0;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)Z")
	public final boolean method4648(@OriginalArg(1) int arg0) {
		return Static303.method4788(arg0) ? this.aBoolean385 : this.aBoolean386;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIZ)V")
	public final void method4651(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (Static303.method4788(arg0)) {
			this.aBoolean385 = arg1;
		} else {
			this.aBoolean386 = arg1;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!ge;)V")
	public final void method4653(@OriginalArg(1) Class1_Sub6 arg0) {
		arg0.method3937(18);
		arg0.method3937(this.anInt5447);
		arg0.method3937(this.aBoolean384 ? 1 : 0);
		arg0.method3937(this.aBoolean393 ? 1 : 0);
		arg0.method3937(this.aBoolean380 ? 1 : 0);
		arg0.method3937(this.aBoolean395 ? 1 : 0);
		arg0.method3937(0);
		arg0.method3937(this.aBoolean379 ? 1 : 0);
		arg0.method3937(this.aBoolean388 ? 1 : 0);
		arg0.method3937(this.aBoolean394 ? 1 : 0);
		arg0.method3937(this.anInt5442);
		arg0.method3937(this.anInt5436);
		arg0.method3937(this.aBoolean385 ? 1 : 0);
		arg0.method3937(this.aBoolean386 ? 1 : 0);
		arg0.method3937(this.aBoolean392 ? 1 : 0);
		arg0.method3937(this.aBoolean391 ? 1 : 0);
		arg0.method3937(this.anInt5443);
		arg0.method3937(this.aBoolean381 ? 1 : 0);
		arg0.method3937(this.anInt5444);
		arg0.method3937(this.anInt5439);
		arg0.method3937(this.anInt5431);
		arg0.method3919(this.anInt5455);
		arg0.method3919(this.anInt5456);
		arg0.method3937(Static330.method5083());
		arg0.method3948(this.anInt5453);
		arg0.method3937(this.anInt5429);
		arg0.method3937(this.aBoolean382 ? 1 : 0);
		arg0.method3937(this.aBoolean389 ? 1 : 0);
		arg0.method3937(this.anInt5450);
		arg0.method3937(this.aBoolean387 ? 1 : 0);
		arg0.method3937(this.aBoolean390 ? 1 : 0);
		arg0.method3937(this.anInt5449);
		arg0.method3937(this.aBoolean383 ? 1 : 0);
		arg0.method3937(this.anInt5437);
		arg0.method3937(this.anInt5435);
		arg0.method3937(this.aBoolean396 ? 1 : 0);
		arg0.method3937(this.anInt5440);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZ)I")
	public final int method4655(@OriginalArg(0) int arg0) {
		return Static303.method4788(arg0) ? this.anInt5442 : this.anInt5436;
	}
}
