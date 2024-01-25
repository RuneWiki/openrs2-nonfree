import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class4_Sub7_Sub17 extends Class4_Sub7 {

	@OriginalMember(owner = "client!wba", name = "y", descriptor = "Lclient!jw;")
	private Class183 aClass183_41;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IILclient!eh;)V")
	private void method7851(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(20) int local20 = arg1.method6015();
		@Pc(27) int local27;
		if (this.aClass183_41 == null) {
			local27 = Static514.method7261(local20);
			this.aClass183_41 = new Class183(local27);
		}
		for (local27 = 0; local27 < local20; local27++) {
			@Pc(48) boolean local48 = arg1.method6015() == 1;
			@Pc(52) int local52 = arg1.method6023();
			@Pc(61) Class4 local61;
			if (local48) {
				local61 = new Class4_Sub46(arg1.method6010());
			} else {
				local61 = new Class4_Sub33(arg1.method6026());
			}
			this.aClass183_41.method4282((long) local52, local61);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!eh;I)V")
	public void method7853(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method6015();
			if (local14 == 0) {
				return;
			}
			this.method7851(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method7854(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass183_41 == null) {
			return arg0;
		} else {
			@Pc(21) Class4_Sub46 local21 = (Class4_Sub46) this.aClass183_41.method4289((long) arg1);
			return local21 == null ? arg0 : local21.aString95;
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BII)I")
	public int method7856(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass183_41 == null) {
			return arg1;
		} else {
			@Pc(21) Class4_Sub33 local21 = (Class4_Sub33) this.aClass183_41.method4289((long) arg0);
			return local21 == null ? arg1 : local21.anInt6079;
		}
	}
}
