import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class Class49 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Z")
	public boolean aBoolean230;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "Z")
	protected boolean aBoolean240;

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "Z")
	protected boolean aBoolean243;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Z")
	public boolean aBoolean232 = true;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
	public int anInt3201 = 0;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
	public int anInt3202 = 0;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Z")
	public boolean aBoolean237 = false;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Z")
	public boolean aBoolean235 = true;

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "Z")
	public boolean aBoolean245 = false;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
	public int anInt3204 = 127;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Z")
	public boolean aBoolean239 = false;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
	public int anInt3200 = 0;

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
	protected int anInt3217 = 2;

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
	public int anInt3208 = 1;

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
	public int anInt3211 = 0;

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "Z")
	protected boolean aBoolean244 = true;

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "Z")
	public boolean aBoolean242 = true;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Z")
	public boolean aBoolean231 = true;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Z")
	public boolean aBoolean234 = true;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
	public int anInt3207 = 2;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
	public int anInt3199 = 127;

	@OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
	protected int anInt3213 = 0;

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "Z")
	public boolean aBoolean246 = true;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "Z")
	public boolean aBoolean238 = true;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Z")
	public boolean aBoolean233 = true;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "Z")
	public boolean aBoolean236 = true;

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
	public int anInt3212 = 0;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
	public int anInt3203 = 255;

	@OriginalMember(owner = "client!dg", name = "N", descriptor = "Z")
	public boolean aBoolean247 = true;

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
	public int anInt3220 = 3;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "Z")
	public boolean aBoolean241 = true;

	@OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
	public int anInt3221 = 2;

	@OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
	public int anInt3216 = 2;

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
	public int anInt3218 = 0;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	protected Class49() {
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZB)V")
	public final void method2476(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.aBoolean243 = arg1;
		} else {
			this.aBoolean240 = arg1;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
	public final int method2478(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt3217 : this.anInt3213;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	public final void method2480(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.anInt3217 = arg1;
		} else {
			this.anInt3213 = arg1;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)Z")
	public final boolean method2481(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean243 : this.aBoolean240;
	}
}
