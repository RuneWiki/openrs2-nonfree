import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public abstract class Class79 {

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "Z")
	protected boolean aBoolean153;

	@OriginalMember(owner = "client!ut", name = "D", descriptor = "Z")
	protected boolean aBoolean158;

	@OriginalMember(owner = "client!ut", name = "L", descriptor = "Z")
	public boolean aBoolean160;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "Z")
	public boolean aBoolean150 = true;

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
	public int anInt2146 = 0;

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "Z")
	public boolean aBoolean149 = true;

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "Z")
	public boolean aBoolean147 = true;

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
	public int anInt2151 = 0;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "Z")
	protected boolean aBoolean145 = true;

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
	public int anInt2145 = 0;

	@OriginalMember(owner = "client!ut", name = "w", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
	public int anInt2148 = 0;

	@OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
	protected int anInt2155 = 2;

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "Z")
	public boolean aBoolean151 = true;

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
	public int anInt2157 = 0;

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
	public int anInt2158 = 127;

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
	public int anInt2153 = 3;

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "Z")
	public boolean aBoolean152 = true;

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
	public int anInt2152 = 1;

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "I")
	public int anInt2156 = 2;

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
	public int anInt2150 = 2;

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "Z")
	public boolean aBoolean155 = true;

	@OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
	protected int anInt2162 = 0;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!ut", name = "G", descriptor = "I")
	public int anInt2159 = 0;

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "Z")
	public boolean aBoolean154 = true;

	@OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
	public int anInt2161 = 2;

	@OriginalMember(owner = "client!ut", name = "N", descriptor = "Z")
	public boolean aBoolean162 = true;

	@OriginalMember(owner = "client!ut", name = "O", descriptor = "I")
	public int anInt2163 = 127;

	@OriginalMember(owner = "client!ut", name = "F", descriptor = "Z")
	public boolean aBoolean159 = true;

	@OriginalMember(owner = "client!ut", name = "M", descriptor = "Z")
	public boolean aBoolean161 = false;

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
	public int anInt2147 = 127;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	protected Class79() {
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)V")
	public final void method1937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.anInt2155 = arg1;
		} else {
			this.anInt2162 = arg1;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)Z")
	public final boolean method1939(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean158 : this.aBoolean153;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)I")
	public final int method1942(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt2155 : this.anInt2162;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIZ)V")
	public final void method1943(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.aBoolean158 = arg1;
		} else {
			this.aBoolean153 = arg1;
		}
	}
}
