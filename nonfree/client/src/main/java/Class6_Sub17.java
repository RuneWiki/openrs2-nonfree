import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public abstract class Class6_Sub17 extends Class6 {

	@OriginalMember(owner = "client!gea", name = "o", descriptor = "Z")
	public boolean aBoolean598;

	@OriginalMember(owner = "client!gea", name = "V", descriptor = "Z")
	protected boolean aBoolean611;

	@OriginalMember(owner = "client!gea", name = "W", descriptor = "Z")
	protected boolean aBoolean612;

	@OriginalMember(owner = "client!gea", name = "t", descriptor = "Z")
	public boolean aBoolean600 = true;

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
	public int anInt9269 = 127;

	@OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
	public int anInt9271 = 2;

	@OriginalMember(owner = "client!gea", name = "G", descriptor = "I")
	protected int anInt9276 = 2;

	@OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
	public int anInt9270 = 0;

	@OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
	public int anInt9268 = 0;

	@OriginalMember(owner = "client!gea", name = "D", descriptor = "I")
	public int anInt9274 = 3;

	@OriginalMember(owner = "client!gea", name = "u", descriptor = "Z")
	public boolean aBoolean601 = true;

	@OriginalMember(owner = "client!gea", name = "E", descriptor = "Z")
	protected boolean aBoolean607 = true;

	@OriginalMember(owner = "client!gea", name = "m", descriptor = "Z")
	public boolean aBoolean597 = false;

	@OriginalMember(owner = "client!gea", name = "w", descriptor = "Z")
	public boolean aBoolean603 = false;

	@OriginalMember(owner = "client!gea", name = "q", descriptor = "Z")
	public boolean aBoolean599 = true;

	@OriginalMember(owner = "client!gea", name = "z", descriptor = "Z")
	public boolean aBoolean605 = false;

	@OriginalMember(owner = "client!gea", name = "O", descriptor = "Z")
	public boolean aBoolean609 = true;

	@OriginalMember(owner = "client!gea", name = "N", descriptor = "I")
	public int anInt9282 = 0;

	@OriginalMember(owner = "client!gea", name = "R", descriptor = "I")
	protected int anInt9284 = 0;

	@OriginalMember(owner = "client!gea", name = "J", descriptor = "I")
	protected int anInt9278 = 0;

	@OriginalMember(owner = "client!gea", name = "v", descriptor = "Z")
	public boolean aBoolean602 = true;

	@OriginalMember(owner = "client!gea", name = "B", descriptor = "Z")
	public boolean aBoolean606 = true;

	@OriginalMember(owner = "client!gea", name = "K", descriptor = "I")
	public int anInt9279 = 127;

	@OriginalMember(owner = "client!gea", name = "Z", descriptor = "I")
	public int anInt9289 = 3;

	@OriginalMember(owner = "client!gea", name = "U", descriptor = "I")
	public int anInt9287 = 127;

	@OriginalMember(owner = "client!gea", name = "Q", descriptor = "Z")
	public boolean aBoolean610 = true;

	@OriginalMember(owner = "client!gea", name = "I", descriptor = "Z")
	public boolean aBoolean608 = true;

	@OriginalMember(owner = "client!gea", name = "X", descriptor = "I")
	public int anInt9288 = 127;

	@OriginalMember(owner = "client!gea", name = "bb", descriptor = "I")
	public int anInt9291 = 0;

	@OriginalMember(owner = "client!gea", name = "ab", descriptor = "I")
	public int anInt9290 = 0;

	@OriginalMember(owner = "client!gea", name = "M", descriptor = "I")
	public int anInt9281 = 2;

	@OriginalMember(owner = "client!gea", name = "H", descriptor = "I")
	public int anInt9277 = 1;

	@OriginalMember(owner = "client!gea", name = "Y", descriptor = "Z")
	public boolean aBoolean613 = true;

	@OriginalMember(owner = "client!gea", name = "cb", descriptor = "I")
	public int anInt9292 = 0;

	@OriginalMember(owner = "client!gea", name = "T", descriptor = "I")
	public int anInt9286 = 127;

	@OriginalMember(owner = "client!gea", name = "A", descriptor = "I")
	public int anInt9272 = 0;

	@OriginalMember(owner = "client!gea", name = "eb", descriptor = "Z")
	public boolean aBoolean614 = true;

	@OriginalMember(owner = "client!gea", name = "y", descriptor = "Z")
	public boolean aBoolean604 = true;

	@OriginalMember(owner = "client!gea", name = "fb", descriptor = "I")
	public int anInt9294 = 2;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V")
	protected Class6_Sub17() {
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BIZ)V")
	public final void method7347(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (Static462.method6470(arg0)) {
			this.aBoolean611 = arg1;
		} else {
			this.aBoolean612 = arg1;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IB)I")
	public final int method7348(@OriginalArg(0) int arg0) {
		return Static462.method6470(arg0) ? this.anInt9276 : this.anInt9284;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIB)V")
	public final void method7349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static462.method6470(arg0)) {
			this.anInt9276 = arg1;
		} else {
			this.anInt9284 = arg1;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BI)Z")
	public final boolean method7351(@OriginalArg(1) int arg0) {
		return Static462.method6470(arg0) ? this.aBoolean611 : this.aBoolean612;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!jr;)V")
	public final void method7352(@OriginalArg(1) Class6_Sub12 arg0) {
		arg0.method6047(22);
		arg0.method6047(this.anInt9274);
		arg0.method6047(this.aBoolean607 ? 1 : 0);
		arg0.method6047(this.aBoolean613 ? 1 : 0);
		arg0.method6047(this.aBoolean614 ? 1 : 0);
		arg0.method6047(this.aBoolean601 ? 1 : 0);
		arg0.method6047(0);
		arg0.method6047(this.aBoolean609 ? 1 : 0);
		arg0.method6047(this.aBoolean606 ? 1 : 0);
		arg0.method6047(this.aBoolean602 ? 1 : 0);
		arg0.method6047(this.anInt9276);
		arg0.method6047(this.anInt9284);
		arg0.method6047(this.aBoolean611 ? 1 : 0);
		arg0.method6047(this.aBoolean612 ? 1 : 0);
		arg0.method6047(this.aBoolean604 ? 1 : 0);
		arg0.method6047(this.aBoolean610 ? 1 : 0);
		arg0.method6047(this.anInt9268);
		arg0.method6047(this.aBoolean600 ? 1 : 0);
		arg0.method6047(this.anInt9279);
		arg0.method6047(this.anInt9288);
		arg0.method6047(this.anInt9287);
		arg0.method6047(this.anInt9286);
		arg0.method6047(this.anInt9269);
		arg0.method6032(this.anInt9290);
		arg0.method6032(this.anInt9272);
		arg0.method6047(Static58.method836());
		arg0.method6042(this.anInt9292);
		arg0.method6047(this.anInt9294);
		arg0.method6047(this.aBoolean597 ? 1 : 0);
		arg0.method6047(this.aBoolean598 ? 1 : 0);
		arg0.method6047(this.anInt9291);
		arg0.method6047(this.aBoolean603 ? 1 : 0);
		arg0.method6047(this.aBoolean608 ? 1 : 0);
		arg0.method6047(this.anInt9277);
		arg0.method6047(this.aBoolean599 ? 1 : 0);
		arg0.method6047(this.anInt9281);
		arg0.method6047(this.anInt9271);
		arg0.method6047(this.aBoolean605 ? 1 : 0);
		arg0.method6047(this.anInt9289);
		arg0.method6047(this.anInt9278);
		arg0.method6047(this.anInt9270);
	}
}
