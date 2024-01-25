import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class257 {

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "Lclient!jn;")
	private final Class167 aClass167_41 = new Class167(64);

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "Lclient!vo;")
	private final Class348 aClass348_94;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
	public final int anInt7589;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class257(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_94 = arg2;
		this.anInt7589 = this.aClass348_94.method7981(19);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)Lclient!ja;")
	public Class159 method5966(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_41;
		@Pc(16) Class159 local16;
		synchronized (this.aClass167_41) {
			local16 = (Class159) this.aClass167_41.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class348 local29 = this.aClass348_94;
		@Pc(38) byte[] local38;
		synchronized (this.aClass348_94) {
			local38 = this.aClass348_94.method7964(arg0, 19);
		}
		local16 = new Class159();
		if (local38 != null) {
			local16.method3758(new Class4_Sub13(local38));
		}
		@Pc(60) Class167 local60 = this.aClass167_41;
		synchronized (this.aClass167_41) {
			this.aClass167_41.method3974((long) arg0, local16);
			return local16;
		}
	}
}
