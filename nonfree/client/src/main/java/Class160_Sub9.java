import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class160_Sub9 extends Class160 {

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "Z")
	private boolean aBoolean659;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "Z")
	private boolean aBoolean661;

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "Z")
	private boolean aBoolean658 = false;

	@OriginalMember(owner = "client!tp", name = "A", descriptor = "Lclient!nl;")
	private Class255 aClass255_5;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "Lclient!nl;")
	private Class255 aClass255_3;

	@OriginalMember(owner = "client!tp", name = "x", descriptor = "Lclient!nl;")
	private Class255 aClass255_4;

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "Lclient!nl;")
	private Class255 aClass255_2;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "Z")
	private final boolean aBoolean660;

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "Lclient!kia;")
	private Class29_Sub3 aClass29_Sub3_5;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class160_Sub9(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
		if (super.aClass100_Sub3_40.aBoolean725) {
			this.aClass255_5 = Static524.method7141(super.aClass100_Sub3_40, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass255_3 = Static524.method7141(super.aClass100_Sub3_40, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass255_4 = Static524.method7141(super.aClass100_Sub3_40, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass255_2 = Static524.method7141(super.aClass100_Sub3_40, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass255_5 != null & this.aClass255_3 != null & this.aClass255_4 != null & this.aClass255_2 != null) {
				this.aClass29_Sub3_5 = new Class29_Sub3(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass29_Sub3_5.method8174(false, false);
				this.aBoolean660 = true;
			} else {
				this.aBoolean660 = false;
			}
		} else {
			this.aBoolean660 = false;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8062() {
		return this.aBoolean660;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8066(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V")
	public void method8069() {
		@Pc(7) Class10_Sub3 local7 = super.aClass100_Sub3_40.aClass10_Sub3_4;
		if (this.aBoolean661) {
			OpenGL.glBindProgramARB(34336, ~super.aClass100_Sub3_40.anInt10276 == Integer.MIN_VALUE ? this.aClass255_3.anInt6730 : this.aClass255_2.anInt6730);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass100_Sub3_40.anInt10276 == Integer.MIN_VALUE ? this.aClass255_5.anInt6730 : this.aClass255_4.anInt6730);
		}
		local7.method2817(-1.0F, (float) super.aClass100_Sub3_40.anInt10276, Static671.aFloatArray79, 0.0F, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static671.aFloatArray79[0], Static671.aFloatArray79[1], Static671.aFloatArray79[2], Static671.aFloatArray79[3]);
		OpenGL.glEnable(34336);
		this.aBoolean659 = true;
		this.method8071();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!gb;II)V")
	@Override
	public void method8067(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean658) {
				super.aClass100_Sub3_40.method8702(768, 5890, 0);
				super.aClass100_Sub3_40.method8673(5890, 0);
				this.aBoolean658 = false;
			}
			super.aClass100_Sub3_40.method8743(arg0);
			super.aClass100_Sub3_40.method8671(arg1);
		} else if (!this.aBoolean658) {
			super.aClass100_Sub3_40.method8743(super.aClass100_Sub3_40.aClass29_Sub3_6);
			super.aClass100_Sub3_40.method8671(1);
			super.aClass100_Sub3_40.method8702(768, 34168, 0);
			super.aClass100_Sub3_40.method8673(34168, 0);
			this.aBoolean658 = true;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8065(@OriginalArg(1) boolean arg0) {
		this.aBoolean661 = arg0;
		super.aClass100_Sub3_40.method8678(1);
		super.aClass100_Sub3_40.method8743(this.aClass29_Sub3_5);
		super.aClass100_Sub3_40.method8738(7681, 34165);
		super.aClass100_Sub3_40.method8702(768, 34166, 0);
		super.aClass100_Sub3_40.method8702(770, 5890, 2);
		super.aClass100_Sub3_40.method8673(34168, 0);
		super.aClass100_Sub3_40.method8678(0);
		this.method8069();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	@Override
	public void method8061() {
		if (this.aBoolean659) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean659 = false;
		}
		super.aClass100_Sub3_40.method8678(1);
		super.aClass100_Sub3_40.method8743((Class29) null);
		super.aClass100_Sub3_40.method8738(8448, 8448);
		super.aClass100_Sub3_40.method8702(768, 5890, 0);
		super.aClass100_Sub3_40.method8702(770, 34166, 2);
		super.aClass100_Sub3_40.method8673(5890, 0);
		super.aClass100_Sub3_40.method8678(0);
		if (this.aBoolean658) {
			super.aClass100_Sub3_40.method8702(768, 5890, 0);
			super.aClass100_Sub3_40.method8673(5890, 0);
			this.aBoolean658 = false;
		}
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)V")
	public void method8071() {
		if (!this.aBoolean659) {
			return;
		}
		@Pc(15) int local15 = super.aClass100_Sub3_40.XA();
		@Pc(19) int local19 = super.aClass100_Sub3_40.i();
		@Pc(30) float local30 = -((float) (local15 - local19) * 0.125F) + (float) local15;
		@Pc(42) float local42 = -((float) (local15 - local19) * 0.25F) + (float) local15;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local42, local30, 1.0F / (float) super.aClass100_Sub3_40.anInt10268, (float) super.aClass100_Sub3_40.anInt10272 / 255.0F);
		super.aClass100_Sub3_40.method8678(1);
		super.aClass100_Sub3_40.method8704(super.aClass100_Sub3_40.anInt10270);
		super.aClass100_Sub3_40.method8678(0);
	}
}
