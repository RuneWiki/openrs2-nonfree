import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class56 {

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "Lclient!jn;")
	private final Class167 aClass167_5 = new Class167(16);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "Lclient!vo;")
	private final Class348 aClass348_25;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class56(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_25 = arg2;
		this.aClass348_25.method7981(29);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
	public void method1552() {
		@Pc(2) Class167 local2 = this.aClass167_5;
		synchronized (this.aClass167_5) {
			this.aClass167_5.method3964(5);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIILclient!kc;I)Lclient!pfa;")
	public Class260 method1554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class175 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class350[] local7 = null;
		@Pc(14) Class227 local14 = this.method1557(arg1);
		if (local14.anIntArray362 != null) {
			local7 = new Class350[local14.anIntArray362.length];
			for (@Pc(24) int local24 = 0; local24 < local7.length; local24++) {
				@Pc(34) Class360 local34 = arg3.method4139(local14.anIntArray362[local24]);
				local7[local24] = new Class350(local34.anInt10422, local34.anInt10425, local34.anInt10418, local34.anInt10417, local34.anInt10419, local34.anInt10424, local34.anInt10426, local34.aBoolean709);
			}
		}
		return new Class260(local14.anInt6539, local7, local14.anInt6536, arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public void method1555() {
		@Pc(6) Class167 local6 = this.aClass167_5;
		synchronized (this.aClass167_5) {
			this.aClass167_5.method3961();
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)Lclient!na;")
	private Class227 method1557(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_5;
		@Pc(16) Class227 local16;
		synchronized (this.aClass167_5) {
			local16 = (Class227) this.aClass167_5.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class348 local29 = this.aClass348_25;
		@Pc(38) byte[] local38;
		synchronized (this.aClass348_25) {
			local38 = this.aClass348_25.method7964(arg0, 29);
		}
		local16 = new Class227();
		if (local38 != null) {
			local16.method5175(new Class4_Sub13(local38));
		}
		@Pc(60) Class167 local60 = this.aClass167_5;
		synchronized (this.aClass167_5) {
			this.aClass167_5.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(Z)V")
	public void method1559() {
		@Pc(6) Class167 local6 = this.aClass167_5;
		synchronized (this.aClass167_5) {
			this.aClass167_5.method3975();
		}
	}
}
