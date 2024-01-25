import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class212 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "Lclient!gw;")
	private final Class136 aClass136_38 = new Class136(16);

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Lclient!uu;")
	private final Class343 aClass343_160;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class212(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_160 = arg2;
		this.aClass343_160.method8157(29);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	public void method5408() {
		@Pc(6) Class136 local6 = this.aClass136_38;
		synchronized (this.aClass136_38) {
			this.aClass136_38.method3138();
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
	public void method5412() {
		@Pc(2) Class136 local2 = this.aClass136_38;
		synchronized (this.aClass136_38) {
			this.aClass136_38.method3142();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!sn;IBII)Lclient!hb;")
	public Class137 method5413(@OriginalArg(0) int arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class57[] local7 = null;
		@Pc(12) Class171 local12 = this.method5414(arg3);
		if (local12.anIntArray279 != null) {
			local7 = new Class57[local12.anIntArray279.length];
			for (@Pc(22) int local22 = 0; local22 < local7.length; local22++) {
				@Pc(32) Class201 local32 = arg1.method7622(local12.anIntArray279[local22]);
				local7[local22] = new Class57(local32.anInt6111, local32.anInt6108, local32.anInt6107, local32.anInt6106, local32.anInt6115, local32.anInt6109, local32.anInt6112, local32.aBoolean445);
			}
		}
		return new Class137(local12.anInt5101, local7, local12.anInt5098, arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Lclient!jea;")
	private Class171 method5414(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_38;
		@Pc(16) Class171 local16;
		synchronized (this.aClass136_38) {
			local16 = (Class171) this.aClass136_38.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class343 local37 = this.aClass343_160;
		@Pc(46) byte[] local46;
		synchronized (this.aClass343_160) {
			local46 = this.aClass343_160.method8132(29, arg0);
		}
		local16 = new Class171();
		if (local46 != null) {
			local16.method4388(new Class3_Sub9(local46));
		}
		@Pc(68) Class136 local68 = this.aClass136_38;
		synchronized (this.aClass136_38) {
			this.aClass136_38.method3135(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V")
	public void method5416() {
		@Pc(10) Class136 local10 = this.aClass136_38;
		synchronized (this.aClass136_38) {
			this.aClass136_38.method3132(5);
		}
	}
}
