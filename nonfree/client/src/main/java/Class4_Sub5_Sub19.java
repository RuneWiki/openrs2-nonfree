import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class4_Sub5_Sub19 extends Class4_Sub5 {

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "Lclient!dj;")
	private Class66 aClass66_44;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)I")
	public int method8587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass66_44 == null) {
			return arg1;
		} else {
			@Pc(24) Class4_Sub24 local24 = (Class4_Sub24) this.aClass66_44.method1994((long) arg0);
			return local24 == null ? arg1 : local24.anInt4156;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!es;B)V")
	public void method8588(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8865();
			if (local5 == 0) {
				return;
			}
			this.method8590(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method8589(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass66_44 == null) {
			return arg1;
		} else {
			@Pc(22) Class4_Sub46 local22 = (Class4_Sub46) this.aClass66_44.method1994((long) arg0);
			return local22 == null ? arg1 : local22.aString110;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILclient!es;I)V")
	private void method8590(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(12) int local12 = arg0.method8865();
		@Pc(19) int local19;
		if (this.aClass66_44 == null) {
			local19 = Static162.method2593(local12);
			this.aClass66_44 = new Class66(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(40) boolean local40 = arg0.method8865() == 1;
			@Pc(44) int local44 = arg0.method8827();
			@Pc(53) Class4 local53;
			if (local40) {
				local53 = new Class4_Sub46(arg0.method8853());
			} else {
				local53 = new Class4_Sub24(arg0.method8850());
			}
			this.aClass66_44.method1985(local53, (long) local44);
		}
	}
}
