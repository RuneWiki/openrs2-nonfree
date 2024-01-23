import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class37 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
	private int anInt1079;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
	public int anInt1084;

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
	public int anInt1086;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!ug;I)V")
	public void method919(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub26 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method3915();
			if (local17 == 0) {
				return;
			}
			this.method922(arg0, local17, arg1);
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)Lclient!qn;")
	public Class3_Sub4_Sub12_Sub2 method921() {
		@Pc(19) Class3_Sub4_Sub12_Sub2 local19 = (Class3_Sub4_Sub12_Sub2) Static148.aClass98_20.method2570((long) this.anInt1079);
		if (local19 != null) {
			return local19;
		}
		local19 = Static181.method3044(this.anInt1079, Static44.aClass155_22);
		if (local19 != null) {
			Static148.aClass98_20.method2568(local19, (long) this.anInt1079);
		}
		return local19;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BIILclient!ug;)V")
	private void method922(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub26 arg2) {
		if (arg1 == 1) {
			this.anInt1079 = arg2.method3948();
		} else if (arg1 == 2) {
			this.anInt1086 = arg2.method3915();
			this.anInt1084 = arg2.method3915();
		}
	}
}
