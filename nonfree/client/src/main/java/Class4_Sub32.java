import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class4_Sub32 extends Class4 {

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
	public int anInt5354 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
	public int anInt5357 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
	public int anInt5361 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
	public int anInt5359 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
	public int anInt5353 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
	public int anInt5356 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
	public int anInt5362 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
	public int anInt5358 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "Lclient!ke;")
	public final Class4_Sub30 aClass4_Sub30_1;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!ke;)V")
	public Class4_Sub32(@OriginalArg(0) Class4_Sub30 arg0) {
		this.aClass4_Sub30_1 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BII)Z")
	public boolean method4722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt5359 && arg0 <= this.anInt5357 && this.anInt5353 <= arg1 && arg1 <= this.anInt5362) {
			return true;
		} else {
			return this.anInt5356 <= arg0 && arg0 <= this.anInt5358 && this.anInt5361 <= arg1 && arg1 <= this.anInt5354;
		}
	}
}
