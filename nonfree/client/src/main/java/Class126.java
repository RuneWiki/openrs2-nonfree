import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class126 {

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!co;")
	private final Class41 aClass41_47 = new Class41(64);

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
	public int anInt3766 = 0;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!g;")
	private final Class83 aClass83_68;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public final int anInt3765;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class126(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_68 = arg2;
		this.anInt3765 = this.aClass83_68.method1955(4);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
	public void method3295() {
		@Pc(2) Class41 local2 = this.aClass41_47;
		synchronized (this.aClass41_47) {
			this.aClass41_47.method825();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)Lclient!tb;")
	public Class214 method3296(@OriginalArg(0) int arg0) {
		@Pc(13) Class41 local13 = this.aClass41_47;
		@Pc(23) Class214 local23;
		synchronized (this.aClass41_47) {
			local23 = (Class214) this.aClass41_47.method823((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(40) byte[] local40 = this.aClass83_68.method1968(arg0, 4);
		local23 = new Class214();
		local23.aClass126_6 = this;
		local23.anInt6103 = arg0;
		if (local40 != null) {
			local23.method5342(new Class2_Sub24(local40));
		}
		local23.method5341();
		@Pc(65) Class41 local65 = this.aClass41_47;
		synchronized (this.aClass41_47) {
			this.aClass41_47.method832((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
	public void method3297() {
		@Pc(2) Class41 local2 = this.aClass41_47;
		synchronized (this.aClass41_47) {
			this.aClass41_47.method829();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public void method3298() {
		@Pc(6) Class41 local6 = this.aClass41_47;
		synchronized (this.aClass41_47) {
			this.aClass41_47.method826(5);
		}
	}
}
