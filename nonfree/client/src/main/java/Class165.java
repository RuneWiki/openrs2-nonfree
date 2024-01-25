import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class Class165 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "Z")
	public boolean aBoolean290;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "Z")
	protected boolean aBoolean291;

	@OriginalMember(owner = "client!op", name = "v", descriptor = "Z")
	protected boolean aBoolean300;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	protected int anInt4198 = 2;

	@OriginalMember(owner = "client!op", name = "c", descriptor = "I")
	protected int anInt4194 = 0;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "Z")
	public boolean aBoolean296 = false;

	@OriginalMember(owner = "client!op", name = "s", descriptor = "I")
	public int anInt4202 = 127;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "I")
	public int anInt4193 = 2;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "Z")
	public boolean aBoolean297 = false;

	@OriginalMember(owner = "client!op", name = "t", descriptor = "Z")
	public boolean aBoolean298 = true;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "Z")
	public boolean aBoolean292 = true;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "Z")
	public boolean aBoolean301 = true;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "I")
	public int anInt4196 = 0;

	@OriginalMember(owner = "client!op", name = "A", descriptor = "Z")
	public boolean aBoolean303 = true;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "Z")
	protected boolean aBoolean299 = true;

	@OriginalMember(owner = "client!op", name = "C", descriptor = "I")
	public int anInt4206 = 2;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "Z")
	public boolean aBoolean293 = true;

	@OriginalMember(owner = "client!op", name = "B", descriptor = "I")
	public int anInt4205 = 127;

	@OriginalMember(owner = "client!op", name = "E", descriptor = "I")
	public int anInt4208 = 255;

	@OriginalMember(owner = "client!op", name = "H", descriptor = "Z")
	public boolean aBoolean304 = true;

	@OriginalMember(owner = "client!op", name = "G", descriptor = "I")
	public int anInt4210 = 3;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "I")
	public int anInt4197 = 0;

	@OriginalMember(owner = "client!op", name = "K", descriptor = "I")
	public int anInt4212 = 0;

	@OriginalMember(owner = "client!op", name = "z", descriptor = "Z")
	public boolean aBoolean302 = false;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "Z")
	public boolean aBoolean295 = true;

	@OriginalMember(owner = "client!op", name = "M", descriptor = "I")
	public int anInt4214 = 2;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "I")
	public int anInt4201 = 0;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "I")
	public int anInt4200 = 0;

	@OriginalMember(owner = "client!op", name = "O", descriptor = "I")
	public int anInt4215 = 1;

	@OriginalMember(owner = "client!op", name = "P", descriptor = "Z")
	public boolean aBoolean306 = true;

	@OriginalMember(owner = "client!op", name = "N", descriptor = "Z")
	public boolean aBoolean305 = true;

	@OriginalMember(owner = "client!op", name = "Q", descriptor = "Z")
	public boolean aBoolean307 = true;

	@OriginalMember(owner = "client!op", name = "I", descriptor = "I")
	public int anInt4211 = 0;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "Z")
	public boolean aBoolean294 = true;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	protected Class165() {
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZIB)V")
	public final void method3388(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.aBoolean291 = arg0;
		} else {
			this.aBoolean300 = arg0;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)Z")
	public final boolean method3390(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean291 : this.aBoolean300;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(III)V")
	public final void method3391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.anInt4198 = arg1;
		} else {
			this.anInt4194 = arg1;
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(BI)I")
	public final int method3392(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt4198 : this.anInt4194;
	}
}
