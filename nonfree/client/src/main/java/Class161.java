import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class161 {

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "Lclient!kh;")
	private final Class134 aClass134_39 = new Class134(16);

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!ul;")
	private final Class246 aClass246_139;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class161(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_139 = arg2;
		this.aClass246_139.method5492(29);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
	public void method3746() {
		@Pc(2) Class134 local2 = this.aClass134_39;
		synchronized (this.aClass134_39) {
			this.aClass134_39.method3267();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!kt;IIIII)Lclient!ng;")
	public Class171 method3748(@OriginalArg(0) Class142 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class157[] local7 = null;
		@Pc(12) Class255 local12 = this.method3752(arg4);
		if (local12.anIntArray612 != null) {
			local7 = new Class157[local12.anIntArray612.length];
			for (@Pc(27) int local27 = 0; local27 < local7.length; local27++) {
				@Pc(37) Class189 local37 = arg0.method3367(local12.anIntArray612[local27]);
				local7[local27] = new Class157(local37.anInt5224, local37.anInt5225, local37.anInt5231, local37.anInt5223, local37.anInt5228, local37.anInt5230, local37.anInt5227, local37.aBoolean376);
			}
		}
		return new Class171(local12.anInt6763, local7, local12.anInt6764, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
	public void method3749() {
		@Pc(6) Class134 local6 = this.aClass134_39;
		synchronized (this.aClass134_39) {
			this.aClass134_39.method3272();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	public void method3751() {
		@Pc(2) Class134 local2 = this.aClass134_39;
		synchronized (this.aClass134_39) {
			this.aClass134_39.method3270(5);
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(ZI)Lclient!uu;")
	private Class255 method3752(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_39;
		@Pc(16) Class255 local16;
		synchronized (this.aClass134_39) {
			local16 = (Class255) this.aClass134_39.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_139;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_139) {
			local38 = this.aClass246_139.method5477(29, arg0);
		}
		local16 = new Class255();
		if (local38 != null) {
			local16.method5564(new Class1_Sub5(local38));
		}
		@Pc(60) Class134 local60 = this.aClass134_39;
		synchronized (this.aClass134_39) {
			this.aClass134_39.method3263((long) arg0, local16);
			return local16;
		}
	}
}
