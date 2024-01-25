import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pba", name = "E", descriptor = "Lclient!efa;")
	private Class90 aClass90_24;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLclient!gk;I)V")
	private void method5496(@OriginalArg(1) Class2_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(12) int local12 = arg0.method4464();
		@Pc(19) int local19;
		if (this.aClass90_24 == null) {
			local19 = Static355.method5078(local12);
			this.aClass90_24 = new Class90(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(40) boolean local40 = arg0.method4464() == 1;
			@Pc(44) int local44 = arg0.method4503();
			@Pc(53) Class2 local53;
			if (local40) {
				local53 = new Class2_Sub17(arg0.method4494());
			} else {
				local53 = new Class2_Sub44(arg0.method4509());
			}
			this.aClass90_24.method1684(local53, (long) local44);
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
	public String method5500(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass90_24 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub17 local16 = (Class2_Sub17) this.aClass90_24.method1685((long) arg0);
			return local16 == null ? arg1 : local16.aString37;
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIZ)I")
	public int method5502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass90_24 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub44 local21 = (Class2_Sub44) this.aClass90_24.method1685((long) arg1);
			return local21 == null ? arg0 : local21.anInt7748;
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method5503(@OriginalArg(0) Class2_Sub7 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4464();
			if (local15 == 0) {
				return;
			}
			this.method5496(arg0, local15);
		}
	}
}
