import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public abstract class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "Z")
	protected boolean aBoolean180;

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "Z")
	protected boolean aBoolean184;

	@OriginalMember(owner = "client!ks", name = "V", descriptor = "Z")
	public boolean aBoolean196;

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "Z")
	public boolean aBoolean179 = false;

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
	public int anInt2180 = 2;

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
	public int anInt2181 = 0;

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "Z")
	public boolean aBoolean183 = true;

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "Z")
	public boolean aBoolean182 = true;

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "Z")
	public boolean aBoolean187 = true;

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "Z")
	public boolean aBoolean181 = true;

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
	public int anInt2183 = 2;

	@OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
	public int anInt2190 = 127;

	@OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
	public int anInt2195 = 3;

	@OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
	public int anInt2196 = 0;

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
	protected int anInt2193 = 2;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
	public int anInt2182 = 0;

	@OriginalMember(owner = "client!ks", name = "F", descriptor = "I")
	public int anInt2192 = 0;

	@OriginalMember(owner = "client!ks", name = "M", descriptor = "Z")
	public boolean aBoolean190 = true;

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "Z")
	public boolean aBoolean189 = true;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
	public int anInt2189 = 0;

	@OriginalMember(owner = "client!ks", name = "R", descriptor = "Z")
	public boolean aBoolean192 = false;

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
	protected int anInt2197 = 0;

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
	public int anInt2191 = 1;

	@OriginalMember(owner = "client!ks", name = "U", descriptor = "Z")
	public boolean aBoolean195 = true;

	@OriginalMember(owner = "client!ks", name = "Q", descriptor = "Z")
	public boolean aBoolean191 = true;

	@OriginalMember(owner = "client!ks", name = "N", descriptor = "I")
	public int anInt2198 = 2;

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "Z")
	protected boolean aBoolean186 = true;

	@OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
	public int anInt2194 = 3;

	@OriginalMember(owner = "client!ks", name = "E", descriptor = "Z")
	public boolean aBoolean188 = true;

	@OriginalMember(owner = "client!ks", name = "T", descriptor = "Z")
	public boolean aBoolean194 = true;

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
	public int anInt2187 = 127;

	@OriginalMember(owner = "client!ks", name = "X", descriptor = "I")
	public int anInt2202 = 127;

	@OriginalMember(owner = "client!ks", name = "S", descriptor = "Z")
	public boolean aBoolean193 = true;

	@OriginalMember(owner = "client!ks", name = "Z", descriptor = "Z")
	public boolean aBoolean197 = false;

	@OriginalMember(owner = "client!ks", name = "W", descriptor = "I")
	public int anInt2201 = 0;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
	protected Class2_Sub19() {
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)Z")
	public final boolean method2134(@OriginalArg(1) int arg0) {
		return Static360.method7738(arg0) ? this.aBoolean184 : this.aBoolean180;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI)I")
	public final int method2135(@OriginalArg(1) int arg0) {
		return Static360.method7738(arg0) ? this.anInt2193 : this.anInt2197;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZZI)V")
	public final void method2136(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (Static360.method7738(arg1)) {
			this.aBoolean184 = arg0;
		} else {
			this.aBoolean180 = arg0;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)V")
	public final void method2138(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static360.method7738(arg1)) {
			this.anInt2193 = arg0;
		} else {
			this.anInt2197 = arg0;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!ps;)V")
	public final void method2139(@OriginalArg(1) Class2_Sub29 arg0) {
		arg0.method5172(18);
		arg0.method5172(this.anInt2194);
		arg0.method5172(this.aBoolean186 ? 1 : 0);
		arg0.method5172(this.aBoolean193 ? 1 : 0);
		arg0.method5172(this.aBoolean183 ? 1 : 0);
		arg0.method5172(this.aBoolean182 ? 1 : 0);
		arg0.method5172(0);
		arg0.method5172(this.aBoolean187 ? 1 : 0);
		arg0.method5172(this.aBoolean189 ? 1 : 0);
		arg0.method5172(this.aBoolean188 ? 1 : 0);
		arg0.method5172(this.anInt2193);
		arg0.method5172(this.anInt2197);
		arg0.method5172(this.aBoolean184 ? 1 : 0);
		arg0.method5172(this.aBoolean180 ? 1 : 0);
		arg0.method5172(this.aBoolean194 ? 1 : 0);
		arg0.method5172(this.aBoolean181 ? 1 : 0);
		arg0.method5172(this.anInt2181);
		arg0.method5172(this.aBoolean195 ? 1 : 0);
		arg0.method5172(this.anInt2187);
		arg0.method5172(this.anInt2190);
		arg0.method5172(this.anInt2202);
		arg0.method5217(this.anInt2182);
		arg0.method5217(this.anInt2201);
		arg0.method5172(Static523.method7573());
		arg0.method5185(this.anInt2196);
		arg0.method5172(this.anInt2198);
		arg0.method5172(this.aBoolean197 ? 1 : 0);
		arg0.method5172(this.aBoolean196 ? 1 : 0);
		arg0.method5172(this.anInt2189);
		arg0.method5172(this.aBoolean192 ? 1 : 0);
		arg0.method5172(this.aBoolean190 ? 1 : 0);
		arg0.method5172(this.anInt2191);
		arg0.method5172(this.aBoolean191 ? 1 : 0);
		arg0.method5172(this.anInt2180);
		arg0.method5172(this.anInt2183);
		arg0.method5172(this.aBoolean179 ? 1 : 0);
		arg0.method5172(this.anInt2195);
	}
}
