import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class324 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!jn;")
	private final Class167 aClass167_58 = new Class167(64);

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
	public int anInt9646 = 0;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!vo;")
	private final Class348 aClass348_119;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
	public final int anInt9644;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class324(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_119 = arg2;
		this.anInt9644 = this.aClass348_119.method7981(4);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public void method7427() {
		@Pc(14) Class167 local14 = this.aClass167_58;
		synchronized (this.aClass167_58) {
			this.aClass167_58.method3961();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)V")
	public void method7428() {
		@Pc(2) Class167 local2 = this.aClass167_58;
		synchronized (this.aClass167_58) {
			this.aClass167_58.method3964(5);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lclient!ch;")
	public Class54 method7429(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_58;
		@Pc(16) Class54 local16;
		synchronized (this.aClass167_58) {
			local16 = (Class54) this.aClass167_58.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class348 local29 = this.aClass348_119;
		@Pc(38) byte[] local38;
		synchronized (this.aClass348_119) {
			local38 = this.aClass348_119.method7964(arg0, 4);
		}
		local16 = new Class54();
		local16.aClass324_1 = this;
		local16.anInt1746 = arg0;
		if (local38 != null) {
			local16.method1461(new Class4_Sub13(local38));
		}
		local16.method1463();
		@Pc(71) Class167 local71 = this.aClass167_58;
		synchronized (this.aClass167_58) {
			this.aClass167_58.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public void method7430() {
		@Pc(2) Class167 local2 = this.aClass167_58;
		synchronized (this.aClass167_58) {
			this.aClass167_58.method3975();
		}
	}
}
