import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class5_Sub52 extends Class5 {

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
	public int anInt10411 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
	public int anInt10416 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
	public int anInt10415 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
	public int anInt10417 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
	public int anInt10412 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
	public int anInt10414 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
	public int anInt10419 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
	public int anInt10420 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "Lclient!sg;")
	public final Class5_Sub49 aClass5_Sub49_1;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!sg;)V")
	public Class5_Sub52(@OriginalArg(0) Class5_Sub49 arg0) {
		this.aClass5_Sub49_1 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Z")
	public boolean method8829(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt10414 && this.anInt10415 >= arg0 && arg1 >= this.anInt10416 && this.anInt10412 >= arg1) {
			return true;
		} else {
			return this.anInt10411 <= arg0 && this.anInt10419 >= arg0 && arg1 >= this.anInt10420 && this.anInt10417 >= arg1;
		}
	}
}
