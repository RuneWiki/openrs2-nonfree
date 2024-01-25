import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class191 {

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "Lclient!ug;")
	public Class56 aClass56_5;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public int anInt5986;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
	public int anInt5989;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "Lclient!ti;")
	public Class191 aClass191_2;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
	public int anInt5991;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public final int anInt5987;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
	public final int anInt5988;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(II)V")
	public Class191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5987 = arg1;
		this.anInt5988 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!ti;I)V")
	public Class191(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1) {
		this.aClass191_2 = arg0;
		this.anInt5988 = this.aClass191_2.anInt5988;
		this.aClass56_5 = this.aClass191_2.aClass56_5;
		this.anInt5987 = arg1 + this.aClass191_2.anInt5987;
	}
}
