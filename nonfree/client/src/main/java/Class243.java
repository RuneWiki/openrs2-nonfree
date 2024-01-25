import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class243 {

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "Lclient!lh;")
	private final Class151 aClass151_169 = new Class151(16);

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Lclient!hh;")
	private final Class109 aClass109_93;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class243(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_93 = arg2;
		this.aClass109_93.method2322(29);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public void method5511() {
		@Pc(6) Class151 local6 = this.aClass151_169;
		synchronized (this.aClass151_169) {
			this.aClass151_169.method3297(5);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public void method5512() {
		@Pc(10) Class151 local10 = this.aClass151_169;
		synchronized (this.aClass151_169) {
			this.aClass151_169.method3299();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)Lclient!ue;")
	private Class238 method5513(@OriginalArg(0) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_169;
		@Pc(22) Class238 local22;
		synchronized (this.aClass151_169) {
			local22 = (Class238) this.aClass151_169.method3288((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(39) byte[] local39 = this.aClass109_93.method2349(29, arg0);
		local22 = new Class238();
		if (local39 != null) {
			local22.method5474(new Class1_Sub14(local39));
		}
		@Pc(55) Class151 local55 = this.aClass151_169;
		synchronized (this.aClass151_169) {
			this.aClass151_169.method3291((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
	public void method5514() {
		@Pc(10) Class151 local10 = this.aClass151_169;
		synchronized (this.aClass151_169) {
			this.aClass151_169.method3298();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!mk;BIIII)Lclient!tc;")
	public Class223 method5516(@OriginalArg(0) Class163 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class6[] local7 = null;
		@Pc(21) Class238 local21 = this.method5513(arg2);
		if (local21.anIntArray524 != null) {
			local7 = new Class6[local21.anIntArray524.length];
			for (@Pc(31) int local31 = 0; local31 < local7.length; local31++) {
				@Pc(41) Class250 local41 = arg0.method3570(local21.anIntArray524[local31]);
				local7[local31] = new Class6(local41.anInt7339, local41.anInt7340, local41.anInt7331, local41.anInt7334, local41.anInt7343, local41.anInt7342, local41.anInt7341, local41.aBoolean625);
			}
		}
		return new Class223(local21.anInt7115, local7, local21.anInt7116, arg4, arg3, arg1);
	}
}
