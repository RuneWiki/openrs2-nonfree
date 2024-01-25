import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class151 implements Interface27 {

	@OriginalMember(owner = "client!ifa", name = "h", descriptor = "Lclient!vr;")
	private Class33 aClass33_8;

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "Lclient!aj;")
	private final Class15 aClass15_69;

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "Lclient!jfa;")
	private final Class166 aClass166_1;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!aj;Lclient!jfa;)V")
	public Class151(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class166 arg1) {
		this.aClass15_69 = arg0;
		this.aClass166_1 = arg1;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7760() {
		@Pc(18) int local18 = Static312.anInt5191 > Static33.anInt10742 ? Static312.anInt5191 : Static33.anInt10742;
		@Pc(29) int local29 = Static602.anInt9666 >= Static222.anInt4196 ? Static602.anInt9666 : Static222.anInt4196;
		@Pc(33) int local33 = this.aClass33_8.method7645();
		@Pc(37) int local37 = this.aClass33_8.method7658();
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = local18;
		@Pc(47) int local47 = local18 * local37 / local33;
		@Pc(53) int local53 = (local29 - local47) / 2;
		if (local29 < local47) {
			local53 = 0;
			local41 = local29 * local33 / local37;
			local47 = local29;
			local39 = (local18 - local41) / 2;
		}
		this.aClass33_8.method7651(local39, local53, local41, local47);
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7759() {
		return this.aClass15_69.method526(this.aClass166_1.anInt4792);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
	@Override
	public void method7758() {
		this.aClass33_8 = Static343.method5151(this.aClass15_69, this.aClass166_1.anInt4792);
	}
}
