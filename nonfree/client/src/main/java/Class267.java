import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class267 {

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!of;")
	private final Class188 aClass188_58 = new Class188(64);

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!mn;")
	private final Class171 aClass171_102;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	public final int anInt7442;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class267(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_102 = arg2;
		if (this.aClass171_102 == null) {
			this.anInt7442 = 0;
		} else {
			this.anInt7442 = this.aClass171_102.method3662(16);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lclient!ag;")
	public Class7 method6044(@OriginalArg(0) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_58;
		@Pc(16) Class7 local16;
		synchronized (this.aClass188_58) {
			local16 = (Class7) this.aClass188_58.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class171 local34 = this.aClass171_102;
		@Pc(43) byte[] local43;
		synchronized (this.aClass171_102) {
			local43 = this.aClass171_102.method3658(16, arg0);
		}
		local16 = new Class7();
		if (local43 != null) {
			local16.method91(new Class2_Sub17(local43));
		}
		@Pc(65) Class188 local65 = this.aClass188_58;
		synchronized (this.aClass188_58) {
			this.aClass188_58.method4155((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public void method6046() {
		@Pc(6) Class188 local6 = this.aClass188_58;
		synchronized (this.aClass188_58) {
			this.aClass188_58.method4154();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)V")
	public void method6047() {
		@Pc(2) Class188 local2 = this.aClass188_58;
		synchronized (this.aClass188_58) {
			this.aClass188_58.method4169(5);
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	public void method6048() {
		@Pc(2) Class188 local2 = this.aClass188_58;
		synchronized (this.aClass188_58) {
			this.aClass188_58.method4156();
		}
	}
}
