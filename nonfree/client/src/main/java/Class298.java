import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class298 {

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "Lclient!ui;")
	private final Class359 aClass359_55 = new Class359(16);

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!lga;")
	private final Class223 aClass223_97;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class298(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_97 = arg2;
		this.aClass223_97.method5264(29);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Lclient!faa;")
	private Class107 method7252(@OriginalArg(0) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_55;
		@Pc(16) Class107 local16;
		synchronized (this.aClass359_55) {
			local16 = (Class107) this.aClass359_55.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class223 local30 = this.aClass223_97;
		@Pc(39) byte[] local39;
		synchronized (this.aClass223_97) {
			local39 = this.aClass223_97.method5267(arg0, 29);
		}
		local16 = new Class107();
		if (local39 != null) {
			local16.method2922(new Class6_Sub15(local39));
		}
		@Pc(70) Class359 local70 = this.aClass359_55;
		synchronized (this.aClass359_55) {
			this.aClass359_55.method8515((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public void method7253() {
		@Pc(2) Class359 local2 = this.aClass359_55;
		synchronized (this.aClass359_55) {
			this.aClass359_55.method8511();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILclient!tr;BII)Lclient!pca;")
	public Class277 method7254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class350 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) Class314[] local13 = null;
		@Pc(20) Class107 local20 = this.method7252(arg4);
		if (local20.anIntArray169 != null) {
			local13 = new Class314[local20.anIntArray169.length];
			for (@Pc(30) int local30 = 0; local30 < local13.length; local30++) {
				@Pc(40) Class143 local40 = arg2.method8254(local20.anIntArray169[local30]);
				local13[local30] = new Class314(local40.anInt4182, local40.anInt4183, local40.anInt4180, local40.anInt4189, local40.anInt4184, local40.anInt4181, local40.anInt4192, local40.aBoolean334, local40.anInt4190, local40.anInt4179, local40.anInt4187);
			}
		}
		return new Class277(local20.anInt3116, local13, local20.anInt3118, arg0, arg3, arg1, local20.anInt3120, local20.anInt3113);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V")
	public void method7255() {
		@Pc(6) Class359 local6 = this.aClass359_55;
		synchronized (this.aClass359_55) {
			this.aClass359_55.method8502(5);
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	public void method7256() {
		@Pc(2) Class359 local2 = this.aClass359_55;
		synchronized (this.aClass359_55) {
			this.aClass359_55.method8507();
		}
	}
}
